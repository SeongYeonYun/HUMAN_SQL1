from django.db import models
from django.utils import timezone

# Create your models here.
class Post(models.Model):
    class Status(models.TextChoices):
        DRAFT = 'DF', 'Draft'
        PUBLISHED = 'PB', 'Published'

    title = models.CharField(max_length=250) #게시물의 제목 필드
    slug = models.SlugField(max_length=250) #SQL데이터 베이스에서 VARCHAR로 변환되는 slug필드
    body = models.TextField() #게시물 본문이 저장되는 장소, TextField
    publish = models.DateTimeField(default = timezone.now) #sql에서 Datetime 컬럼으로 변환되는 DateTimeField 필드.
    created = models.DateTimeField(auto_now_add = True)  #게시물이 생성된 날자와 시간
    updated = models.DateTimeField(auto_now=True) #게시물이 갱신된 마지막 날자와 시간
    status = models.CharField(max_length = 2,choices = Status.choices,default = Status.DRAFT) #models.Textchoies를 상속해 열거형 클래스로 정의
    

    class Meta:
        ordering = ['-publish'] #publish를 기준으로 내림차순
        indexes = [
            models.Index(fields=['-publish'])
        ]




    #객체를 표현한하는 문자열을 반환하는 기본 메서드
    def __str__ (self):
        return self.title