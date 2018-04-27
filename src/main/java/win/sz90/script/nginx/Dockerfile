# 指定基础镜像
FROM nginx

# 指定镜像的维护者
MAINTAINER shawn.zeng "zengbingbing2007@163.com"

# ENV <key> <value> 用于设置环境变量在后续RUN命令都可以使用
ENV RUN_USER nginx
ENV RUN_GROUP nginx
ENV DATA_DIR /data/web
ENV LOG_DIR /data/log/nginx

# 构建指令 RUN可以运行任何被基础image支持的命令
# RUN <command> (the command is run in a shell - `/bin/sh -c`)
# RUN ["executable", "param1", "param2" ... ] (exec form)
RUN mkdir /data/log/nginx -p
RUN chown nginx.nginx -R /data/log/nginx

# 构建指令,将所有拷贝到container中的文件和文件夹权限为0755
# ADD <src> <dest>
ADD web /data/web
ADD nginx.conf /etc/nginx/nginx.conf
ADD default.conf /etc/nginx/conf.d/default.conf

# EXPOSE(暴露容器端口)
# 可以接受范围参数
EXPOSE 80

# 设置容器启动时执行的操作 container启动时执行的命令，但是一个Dockerfile中只能有一个ENTRYPOINT命令,没有cmd的可替换性




