class Herois{
    constructor(array){
      this.heroi = array;
    }



    foraDaGuerraCivil2(){
  return marvel.filter( marvel =>
      marvel.events.items.filter(e => e.name.includes('Civil War') !== -1).length === 0);
    }




    foraDaGuerraCivil(){
        var arrayHerois = [];
        var count = 0;
        for(var m in marvel){
          for(var itens in marvel[m].events.items)  {
              if(marvel[m].events.items[itens].name === 'Civil War'){
                count++;
            }
          }

            if(count===0){
                arrayHerois.push(marvel[m].name);
            }else{
                count = 0;
            }
        }
        return arayHerois;
    }

    maisPublicado(){
        var personagemMaisPublicado;
        var maisPublicado = 0;
        for(var m in marvel){
            var ehMaior = marvel[m].comics.available > maisPublicado;
            if(ehMaior){
                maisPublicado = marvel[m].comics.available;
                personagemMaisPublicado = marvel[m].name;
            }
        }
        return personagemMaisPublicado;
    }

    maisPublicadoRefactor(){
        return  marvel.sort( (h1,h2) => h2.comics.available - h1.comics.available)[0]
    }

    mediaPaginas(){
        var mediaPaginaRevista = [];
        var numPaginas = 0;
        for(var m in marvel){
            for(var iten in marvel[m].comics.items){
                numPaginas += marvel[m].comics.items[iten].pageCount;
            }
            var nome = marvel[m].name;
            var divisor = parseInt(iten) + 1;
            var media = numPaginas / divisor;
            mediaPaginaRevista.push({nome, media});
            numPaginas = 0;
        }

        return mediaPaginaRevista;
    }

    mediaPaginasRefactor(){
      var totalPaginas = marvel.map( marvel =>
          marvel.comics.items.reduce( (acum, comic) => acum + comic.pageCount, 0 )
      ).reduce( ( acum, paginas) => acum + paginas );
      return totalPaginas / marvel.length;
    }

    seriesPorLongevidade(){

    }

    comicMaisCara(){
        var ComicMaisCara = [];
        var maisCara;
        var valorParcialComic = 0;

        for(var m in marvel){
            maisCara = 0;
            for(var iten in marvel[m].comics.items){
                for(var price in marvel[m].comics.items[iten].prices){
                    var soma = marvel[m].comics.items[iten].prices[price].price;
                    valorParcialComic += soma;
                }
                if(valorParcialComic > maisCara){
                    maisCara = valorParcialComic;
                    ComicMaisCara = marvel[m].comics;
                }
            }
        }
        return ComicMaisCara;
    }
}






// marvel.reduce( (ac, marvel) => ac + marvel.comics.available, 0 )

// arr.filter( function (elem) { return elem === 'A'})

// marvel.map( marvel => marvel.comics.available)
