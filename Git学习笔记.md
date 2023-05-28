# Git学习笔记

## 简介

日期：2023年5月28日

作者：HWzmy



工具介绍：

Git 是一个[免费的开源](https://git-scm.com/about/free-and-open-source) 分布式版本控制系统，旨在快速高效地处理从小型项目到大型项目的所有内容。

Git[易于学习](https://git-scm.com/doc)， [体积小，性能快如闪电](https://git-scm.com/about/small-and-fast)。它超越了 Subversion（SVN）、CVS、Perforce 和 ClearCase 等 SCM 工具，具有[廉价的本地分支](https://git-scm.com/about/branching-and-merging)、方便的[临时区域](https://git-scm.com/about/staging-area)和 [多个工作流等](https://git-scm.com/about/distributed)特性。



## 使用软件（网站）

- Git 版本控制管理工具
- GitHub 代码仓库网站



## 前期准备

## 1.Git安装

官网：https://git-scm.com/

下载Git安装包并打开：Git-2.40.1-64-bit.exe

安装成功验证：

```bash
git --version
```

出现版本信息即为安装成功。



常用提交命令：

```bash
git add .

git commit -m 'update notes'

git push origin main
```



遇到一些认证问题：

```
remote: Support for password authentication was removed on August 13，2021.remote: Please see https://docs.github.com/en/get-started/getting-started-with-0it/about-remote-repositories#cloning-with-https-urls for information on currenty recommended modes of authentication.fatal: Authentication failed for "https://github.com/Hwzmy/notes.git/
```

该问题的错误消息指出，自2021年8月13日起，GitHub移除了对密码认证的支持。它建议查看GitHub文档以了解当前推荐的身份验证方式。

根据这个错误消息，你需要改变你的身份验证方式以解决该问题。GitHub推荐使用其他身份验证方式，例如使用个人访问令牌（Personal Access Token，PAT）或SSH密钥进行身份验证。

下面是解决该问题的步骤：

1. 访问GitHub网站，并登录到你的账号。
2. 在右上角的用户菜单中，选择"Settings"。
3. 在左侧菜单中，选择"Developer settings"。
4. 在"Developer settings"页面中，选择"Personal access tokens"。
5. 点击"Generate new token"按钮创建一个新的个人访问令牌。
6. 为令牌提供适当的描述，并选择所需的权限（例如，repo、write:packages等）。
7. 点击"Generate token"按钮生成令牌。
8. 复制生成的个人访问令牌。





生成Token文件

```json
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
```



```bash
git remote set-url origin https://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@github.com/HWzmy/notes.git
```



## 2.创建仓库

说明：我需要一个仓库来记录学习笔记，后续方便查阅资料，代码仓库网站选择全世界最大的开源代码网站：[Github](https://github.com/)



首先打开网站，点击repositories New