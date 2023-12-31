# 提交pr规范

## 1.创建 Issues

###   （1）进入 Issues 的主页面

![1-1.PNG](images%2F1-1.PNG)

### （2）点击 New issue 绿色按钮，就可以去创建

![1-2.PNG](images%2F1-2.PNG)
进入到如下边的页面
![1-2-1.PNG](images%2F1-2-1.PNG)

### （3）给予受托人（就是把这个需求给某个人来解决）(选填)

![1-3.PNG](images%2F1-3.PNG)

### （4）设置标签（标明是什么类型的需求）

一共有9大标签，可以有多个选择，但是一般情况，选一个。如果是bug的选择bug
![1-4.PNG](images%2F1-4.PNG)

### （5）选完标签，去写Title（标题）

标题是有格式要求，必须采取 `[标签] 文字描述` 的格式 比如我标签是bug,则我的标题是：[bug] 点击获取验证码的时候有问题 注意：[ ] 后面要有空格
![1-5.PNG](images%2F1-5.PNG)

### （6）编写内容

将标题进行拓展，把问题说清楚 

可以是文字，可以是图片（图片复制进来就可以） 

还可以是多个需求混在一起的时候，需要多个多选框，则需要这么写：(可选)

```Plaintext
- [ ] (输入框） boolean
```

![1-6.PNG](images%2F1-6.PNG)

## 2.创建pr

###   (1) 从开源项目fork项目到自己的远程仓库

![2-1.PNG](images%2F2-1.PNG)

### (2) 在自己的仓库中clone项目到本地.

![2-2.PNG](images%2F2-2.PNG)

### (3) 本地基于master分支创建一个新的分支修改代码提交到远程仓库，然后点击pull request去创建pr

![2-3.PNG](images%2F2-3.PNG)


### (4)创建正确的pr

![2-4.PNG](images%2F2-4.PNG)

### (5) .创建正确的pr

![2-5.PNG](images%2F2-5.PNG)
在pr请求的时候的内容里面填写 #702,也可以填 close #702,这样当你的pr被合并后，issue也会被标记为closed状态

\#702即为每个issue的编号，当你创建完issue后可以在url中看到，如![2-5-1.PNG](images%2F2-5-1.PNG)

### (6) 指定Reviewers和Assigner，必须得指定一个.

![2-6.PNG](images%2F2-6.PNG)

```Apache
在 GitHub 上，"reviewer"（审阅人）和 "assignee"（指派人）是两个不同的角色，它们在 Pull Request（PR）和 Issue 管理中具有不同的作用：
Reviewer（审阅人）：
    审阅人是指被要求审查和评估 Pull Request 的人员。审阅人通常负责查看 PR 的代码更改、提出建议、检查代码的质量和可维护性，并最终批准或拒绝 PR 的合并。
PR 的作者或其他协作者可以选择将一个或多个审阅人分配给 PR，以便他们进行审查。
审阅人的作用是确保代码的质量、一致性和可维护性，并帮助团队确保代码符合项目的标准和要求。
Assignee（指派人）：
    指派人是指被指定为 Issue 或 PR 的负责人员，他们负责跟踪和解决问题或合并 PR。
通常情况下，指派人可以是 Issue 或 PR 的创建者，也可以是项目团队的成员，或者根据需要指定的其他人员。
指派人的作用是确保问题或 PR 得到适当的关注和处理。他们可能需要协调和跟进工作，确保问题在合适的时间内得到解决或 PR 得到合并。
总结来说，审阅人主要与代码审查和合并相关，而指派人主要与任务和问题的分配和跟踪相关。在实际协作中，这两个角色通常会共同合作，以确保项目的代码和问题得到适当的处理和解决。
```

### (7) 找到上边对应的人给你Approve,之后让Reviewer给你合并

![2-7.PNG](images%2F2-7.PNG)
![2-7-1.PNG](images%2F2-7-1.PNG)

## 3.关闭Issues

### (1) 自动关闭Issue

当你的pr被合并后，如果pr的内容中有close #issueId ，对应的issue也会被标记为closed状态
![3-1-1.PNG](images%2F3-1-1.PNG)
![3-1-2.PNG](images%2F3-1-2.PNG)

### (2) 手动合并pr,并关闭Issue.

![3-2-1.PNG](images%2F3-2-1.PNG)

```SQL
"Squash and merge" 是一个有用的合并选项，特别适用于那些希望保持干净的提交历史的项目。它可以将多个小的提交合并成一个更有组织的提交，以减少分支历史中的噪音和混乱。但要注意，合并后的提交历史将不再包含原始的拉取请求分支上的每个提交，因此某些详细信息可能会丢失。
```

​         大家合并pr的时候选择一定要选择     Squash and merge  这个按钮，这样会在首页的commit message后追加 pr Id,可以根据message直接跳转到 pr界面，对于提交的这次commit解决了什么问题以及怎么解决的很好的关联起来了，如

![3-2-2.PNG](images%2F3-2-2.PNG)
![3-2-3.PNG](images%2F3-2-3.PNG)