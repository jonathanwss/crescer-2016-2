using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Dominio
{
    public interface IProdutoRepositorio
    {
        List<Produto> ListaDeProdutos();

        void EditarProduto(Produto produto);

        void CadastrarProduto(Produto produto);

        Produto BuscarProdutoPorId(int id);
    }
}
