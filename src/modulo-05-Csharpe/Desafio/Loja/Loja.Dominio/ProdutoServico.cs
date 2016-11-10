using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public class ProdutoServico
    {
        private IProdutoRepositorio produtoRepositorio;

        public ProdutoServico(IProdutoRepositorio produtoRepositorio)
        {
            this.produtoRepositorio = produtoRepositorio;
        }

        public List<Produto> ListarProdutos()
        {
            var listaDeProdutos = this.produtoRepositorio.ListaDeProdutos();
            return listaDeProdutos;
        }

        public void SalvarProduto(Produto produto)
        {
            if (produto.Nome.Length > 1)
            {
                if (produto.Id == 0)
                {
                    this.produtoRepositorio.CadastrarProduto(produto);
                }
                else
                {
                    this.produtoRepositorio.EditarProduto(produto);
                }
            }else
            {
                throw new RegraDeNegocioException("Nome deve possuir ao menos 2 caracteres");
            }
         }

        public Produto BuscarProdutoPorId(int id)
        {
           return this.produtoRepositorio.BuscarProdutoPorId(id);
        }
    }
}
