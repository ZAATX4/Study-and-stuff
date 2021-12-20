<?php
session_start();

//Pega as váriaveis do php para o bd
$nome = $_POST['nome'];
$departamento = $_POST['departamento'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$descricao_produto = $_POST['descricao_produto'];
$numero_dep = $_POST['numero_dep'];
$descricao_problema = $_POST['descricao_problema'];

//conexão com o BD
$conn = mysqli_connect("127.0.0.1", "root", "") or die ("Sem conexão com o servidor");
$select = mysqli_select_db($conn, "central") or die ("Sem conexão com Banco de dados");


$result = mysqli_query($conn, "INSERT INTO formulario (nome, departamento, email, telefone, descricao_produto, numero_dep, descricao_problema, created)
 VALUES ('$nome', '$departamento', '$email', '$telefone', '$descricao_produto', '$numero_dep', '$descricao_problema', NOW())");

?>