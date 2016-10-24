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

var funcao = function(elemento){
  return elemento >= 2;
}

function find(array, funcao){

}
