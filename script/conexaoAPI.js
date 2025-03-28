
function cadastrar () { 

    const inputEmail = document.getElementById("email")
    const inputSenha = document.getElementById("senha")
    const inputCpf = document.getElementById("cpf")

    fetch("https://localhost:8080/TechGrocery/CadastrarCliente",
        {
            headers:{
                'Accept': "application/json",
                'Content-type': "application/json"
            },
            method: "POST",
            body: JSON.stringify({ 
                "_id" : inputEmail.value,
                "sSenha" : inputSenha.value,
                "sCpf" : inputCpf.value
            })
        }
    )   
    .then(function (res) {
        const resposta = res.status;
        if(resposta == 201){
            localStorage.setItem('idUser', Iemail.value)
            window.alert("Cadastro realizado com sucesso! ")
            redirecionar()
        }else if( resposta == 500){
            window.alert("Problemas com o nosso servidor, por favor tente mais tarde...")
        } else{
            window.alert("Olhar erro, pq n era pra dar")
        }
    })
    .catch(function (res) { console.log( res.status )})
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
})