from django.db import models
from django.utils import timezone
from django.contrib.auth.models import User

# Create your models here.
class Post(models.Model):
    class Status(models.TextChoices):
        DRAFT = 'DF', 'Draft'
        PUBLISHED = 'PB', 'Published'
    
    #게시물의 제목 필드
    title = models.CharField(max_length=250) 

    #SQL데이터 베이스에서 VARCHAR로 변환되는 slug필드
    slug = models.SlugField(max_length=250) 
    
    #게시물 본문이 저장되는 장소, TextField
    body = models.TextField() 

    #sql에서 Datetime 컬럼으로 변환되는 DateTimeField 필드.
    publish = models.DateTimeField(default = timezone.now)

    #게시물이 생성된 날자와 시간
    created = models.DateTimeField(auto_now_add = True) 

    #게시물이 갱신된 마지막 날자와 시간
    updated = models.DateTimeField(auto_now=True)

    #models.Textchoies를 상속해 열거형 클래스로 정의
    status = models.CharField(max_length = 2,choices = Status.choices,default = Status.DRAFT) 
    
    #작성자 명을 외래키로 지정한다.
    author = models.ForeignKey(User, on_delete = model_CASCADE, related_name = 'blog_posts')
    
    

    class Meta:
        #퀴리셋의 기본 정렬 순서를 publish를 기준으로 역순으로 정렬
        #Django ORM정렬만 함
        ordering = ['-publish'] 

        #데이터 베이스 인덱스 생성, 검색 속도 향상
        #실제 DB 인덱스 생성(성능 최적화 용)
        indexes = [
            models.Index(fields=['-publish'])
        ]




    #객체를 표현하는 문자열을 반환하는 기본 메서드
    def __str__ (self):
        return self.title