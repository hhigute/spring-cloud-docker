

Check Compatiblity Erlang X RabbitMQ
https://www.rabbitmq.com/which-erlang.html


Download Erlang (Pre-req to install RabbitMQ)
https://www.erlang.org/downloads


Download RabbitMQ
https://www.rabbitmq.com/install-windows.html


--------------

Download ZipKin (Trace log)
wget -O zipkin.jar 'https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec'

Windows

SET RABBIT_URI=amqp://localhost
java -jar zipkin-server-2.7.0-exec.jar
