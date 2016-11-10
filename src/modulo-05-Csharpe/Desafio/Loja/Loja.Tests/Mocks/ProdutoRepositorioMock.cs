using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Tests.Mocks
{
    public class ProdutoRepositorioMock : IProdutoRepositorio
    {
        public void CadastrarProduto(Produto produto)
        {
            throw new NotImplementedException();
        }

        public void EditarProduto(Produto produto)
        {
            throw new NotImplementedException();
        }

        public List<Produto> ListaDeProdutos()
        {
            List<Produto> listaProdutos = new List<Produto>()
            {
                new Produto(){ Id = 1, Nome = "Shampoo", Valor = 10 }
            };

            return listaProdutos;
        }

        public Produto BuscarProdutoPorId(int id)
        {
            return null;
        }
    }
}
        