# TesteViaVarejo

<p>1. Com o terminal aberto devemos entrar dentro da pasta TesteViaVarejo/build/libs</p>
<p>2. Na pasta, devemos executar o comando java -jar TesteViaVarejo-0.0.1-SNAPSHOT.jar </p>
<p>3. Após isso devemos passar o payload no Postman no endereço http://localhost:8080/order</p>

<p>Um exemplo de payload seria: 
         "produto": { 
        "codigo": 123, 
        "nome": "Nome do Produto", 
        "valor": 1200.00 
        }, 
    "condicaoPagamento": { 
        "valorEntrada": 200.00, 
        "qtdeParcelas": 6
        } 
        <p>