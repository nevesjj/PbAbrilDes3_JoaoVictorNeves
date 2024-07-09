# PbAbrilDes3_JoaoVictorNeves

# Visão geral do projeto
📌O projeto implementa as seguintes funcionalidades:
📌Cadastro de usuario.
📌Uso de bancos de dados da AWS.
📌Cadastro de categoria de produtos.
📌Cadastro de pagamento.
📌Uso de RabbitMQ.
📌Arquitetura de MicroServices.

# MicroServices
📌Ms customer foi desenvolvido na porta 8082.
📌Ms payment foi desenvolvido na porta 8084.
📌Ms calculate foi desenvolvido na porta 8083.

# Link do RabbitMQ
📌amqps://wcclrnys:hrDTbWqwjcWnWaf1vccNjBgQBHplsPO6@moose.rmq.cloudamqp.com/wcclrnys

# Postman - Customer
📌Post - http://localhost:8082/v1/customer desejado
📌Get - http://localhost:8082/v1/customer/id desejado
📌Put - http://localhost:8082/v1/customer/id desejado
📌Delete - http://localhost:8082/v1/customer/id desejado

# Postman - Rules
📌Post - http://localhost:8083/v1/rules
📌Get - http://localhost:8083/v1/rules/id desejado
📌Put - http://localhost:8083/v1/rules/id desejado
📌Delete - http://localhost:8083/v1/rules/id desejado

# Postman - Payment
📌Post - http://localhost:8084/v1/payments
📌Get - http://localhost:8084/v1/payments/id desejado
📌Get - http://localhost:8084/v1/payments/customer/id desejado

# Rds - url
📌Customer - jdbc:mysql://customer.ch62mi4ogcx5.us-east-1.rds.amazonaws.com:3306/customer1
📌Calculate - jdbc:mysql://calculate.ch62mi4ogcx5.us-east-1.rds.amazonaws.com:3306/calculate1
📌Payment - jdbc:mysql://payment.ch62mi4ogcx5.us-east-1.rds.amazonaws.com:3306/payment1

# Credenciais dos Bancos 
📌username=admin
📌password=root1234



