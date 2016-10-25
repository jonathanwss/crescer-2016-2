var elfo = { nome : 'legolas', experiencia : 1};

function exibirElfoNatela(elfo){
  console.log(elfo);
}

/*
function imprimeArray(array){
  for(var i = 0, len = array.length;i< len; i++){
    console.log(array[i]);
  }
  console.log(i);
}

imprimeArray([1,2,3,4,5]);

*/

// Exercicio 1
function piramideIluminattiNunes(niveis){
var array = [];
var elemento = 'R$';
  for (niveis; niveis > 0; niveis--){
    array.push(elemento);
    elemento += 'R$';
  }
  return array;
}

console.log(piramideIluminattiNunes(9));

// Exercicio 2;
function diglettDig(){
  var imprimir;
  var array = [];
  for(var num = 1; num <= 100; num++){
    if(num%3===0 && num%5===0){
      imprimir = 'DiglettDig trio trio trio';
    }else if(num%3===0){
      imprimir = 'DiglettDig';
    }else if (num%5===0 && num%3!==0) {
      imprimir = 'trio trio trio';
    }else {
      imprimir = num;
    }
   array.push(imprimir);

  }
  return array;
}

console.log(diglettDig());

//Exercicio 3

var funcao = function(elemento){ return elemento > 2;};
var funcao2 = function(elemento){ return typeof elemento === 'string';};
var funcao3 = function(elem) { return typeof elem.nome === 'c';};
var funcao4 = 'Funcao 4';
function find(array, funcao){
    var resultado = [];
   if(typeof funcao === typeof funcao3){
    for(var num =0, len = array.length; num < len; num++){
        var parametro = array[num];
        if(funcao(parametro)===true){
            resultado.push(array[num]);
        }
    }
   }else{
        return array;
        }


    return resultado;

}


console.log(find([1,2,3],funcao));
console.log(find([ 'a', 5, null, false, 'false' ],funcao2));
console.log(find([ { nome: 'a' }, { nome: 'b' }  ], funcao3));
console.log(find([1,2,3,4,5], funcao4));

//Exercicio 4;
/*
var armazenarNumeros = [];
function subtrair(numero) {
    armazenarNumeros.push(numero);
    if(armazenarNumeros.length===2){
        var total = armazenarNumeros[0] - armazenarNumeros[1];
        return total;
        armazenarNumeros.splice(0,2);
    }
    return '';
}
*/
function subtrair2(num){
  function subtrair3(num2) {
    return subtracao = num - num2;
  }
  return subtrair3;
}




//Exercicio 5;

function iguais(obj, obj2){
  if(obj === null || obj2 === null){
    return false;
  }

if(obj.length !== obj2.length){
  return false;
}

    var igual;
    for(i in obj){
        if(obj[i] === obj2[i] || typeof obj[i] === 'object' && typeof obj2[i] === 'object'){
          if(typeof obj[i] === 'object'){
            resultado = iguais(obj[i], obj2[i]);
            if(resultado===false){
              igual = false;
              break;
            }
            }
          igual = true;
        }else{
          igual = false;
          break;
        }
      }


    return igual;
}


function ctrlC(origem){
  var resultado = {};
    for(or in origem){
      if(typeof origem[or] === 'object'){
        ctrlC(origem[or]);
      }else{
          var resultado = origem[or];
          }
    }
    return resultado;
}
