using StreetFighter.Dominio;
using StreetFighter.Infra;
using StreetFighter.Repositorio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Aplicativo
{
    public class ServicoDeUsuario
    {
        public static Usuario BuscarUsuarioAutenticado(string nome, string senha)
        {
            var usuarioRepositorio = new PersonagemRepositorioEntityF.PersonagemRepositorioEntityF();
            var _usuarios = usuarioRepositorio.buscarUsuarios();
            Usuario usuarioEncontrado = _usuarios.FirstOrDefault(
                usuario => usuario.Nome.Equals(nome));

            string senhaDeComparacao =
                ServicoDeCriptografia.ConverterParaMD5($"{nome}_$_{senha}");

            if (usuarioEncontrado != null && usuarioEncontrado.Senha.Equals(senhaDeComparacao))
            {
                return usuarioEncontrado;
            }

            return null;
        }
    }
}
