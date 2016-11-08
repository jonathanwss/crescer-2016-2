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
        void SalvarPersonagem(Personagem personagem);
        void ExcluirPersonagem(Personagem personagem);

    }
}
