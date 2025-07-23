from django.shortcuts import render
from .models import Post #.은 경로 지정
from django.http import Http404
from django.shortcuts import get_object_or_404


# Create your views here.

def post_detail(request,id):
    
    try :
        post = Post.published.get(id=id)
    
    except Post.DoesNotExist :
        raise Http404("NO POST FOUND")
    
    
    post = get_object_or_404(Post, id = id , status = Post.Status.PUBLISHED)
    return render(request, 'blog/post/detail.html',{"post" : post})
    # return render(request, 'blog/post/14-3_6번_Todo.html',{"post" : post})

def post_list(request):
    posts= Post.published.all()
    return render(request, "blog/post/list.html", {"posts" : posts})
    # return render(request, 'blog/post/14-3_6번_Todo.html',{"post" : post})