class Herois{
    constructor(){
        
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