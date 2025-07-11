from django.shortcuts import render
from .models import Post #.은 경로 지정
from django.http import Http404

# Create your views here.

def post_detail(request,id):
    try :
        post = Post.published.get(id=id)
    
    except Post.DoesNotExist :
        raise Http404("NO POST FOUND")
    
    return render(request, 'blog/post/detail.html',{"post" : post})

def post_list(request):
    posts= Post.published.all()
    return render(request, "blog/post/list.html", {"posts" : posts})