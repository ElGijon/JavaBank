# BankSystem / SistemaBancário

This project was developed within Digital Innovation One's Java Developer training course.

----------

Este projeto foi desenvolvido juntamente ao curso de formação Java Developer da Digital Innovation One.

## More About / Mais Sobre...
The proposed design challenge was a simple design of a banking system that would allow the user to perform basic operations.
The system should allow the data to be entered via a terminal and the user would receive a message stating what information was required.

----------------------

O desafio de projeto proposto ser um projeto simples de um sistema bancário que permitiria o usu[ario a realizar operações básicas.
O sistema deveria permitir que os dados fossem inseridos via terminal sendo que o usuário receberia a mensagem de qual informação seria solicitada.


## The Project / O Projeto

This project uses the Scanner class from the java.util package to get input from the user and the Random class from the same package to generate random numbers. The main class, BankSystem, implements a menu-driven interface for a user to perform various banking operations like creating an account, depositing money, withdrawing money, checking balance, and quitting the system. The program uses the Account class to store the details of a bank account like the agency number, account number, account holder's name, and balance. The BankSystem class has a method named "findAccount" that takes an account number and an array of Account objects, and returns the Account object with the matching account number. The program uses a switch statement to perform the corresponding action based on the user's choice.

-------------------------

Este projecto utiliza a classe Scanner do pacote java.util para receber a informação do usuário e a classe Random do mesmo pacote para gerar números aleatórios. A classe principal, BankSystem, implementa uma interface guiada por menus para que o utilizador possa realizar várias operações bancárias como criar uma conta, depositar dinheiro, sacar dinheiro, verificar saldo, e abandonar o sistema. O programa utiliza a classe Account para armazenar os detalhes de uma conta bancária como o número da agência, número da conta, nome do titular da conta, e saldo. A classe BankSystem tem um método chamado "findAccount" que leva um número de conta e um array de objetos Account, e devolve o objeto Account com o número de conta correspondente. O programa utiliza um "switch statement" para executar a ação correspondente com base na escolha do usuário.

## Improvements / Melhorias

I applied some concepts that I researched outside of the proposed challenge and of what had been presented by the course up to that point. With emphasis on the implementations of:

- Random : used to generate the data of the agency number and the user's account number 

- While : used for the initial loop of the system interface

- Switch/Case : used to be able to work with the execution paths present in the project

---------------------------------------------------------------

Utilizei alguns conceitos que busquei fora do desafio proposto e do que fora apresentado pelo curso até então. Com destaque ás implementações de:

- Random : utilizado para gerar os dados do numero da agência e numero da conta do usuário 

- While  : utilizado para o loop inicial da interface do sistema

- Switch/Case  : utilizado para que pudesse trabalhar com as vias de execução presentes no projeto





