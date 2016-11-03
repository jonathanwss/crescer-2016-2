using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Dominio
{
    public interface IPersonagemRepositorio
    {
        List<Personagem> ListarPersonagens();
        void incluirPersonagem(Personagem personagem);
        void excluirPersonagem(Personagem personagem);
        void editarPersonagem(Personagem personagem);

    }
}
