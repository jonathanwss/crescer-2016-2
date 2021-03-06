﻿using Loja.Dominio;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Loja.Repositorio
{
    public class ProdutoRepositorio : IProdutoRepositorio
    {
        public void CadastrarProduto(Produto produto)
        {
            using (var context = new ContextoDeDados())
            {
                context.Entry(produto).State = EntityState.Added;
                context.SaveChanges();
            }
        }

        public void EditarProduto(Produto produto)
        {
            using (var context = new ContextoDeDados())
            {
                context.Entry(produto).State = EntityState.Modified;
                context.SaveChanges();
            }
        }

        public List<Produto> ListaDeProdutos()
        {
            using (var contexto = new ContextoDeDados())
            {
                var listaDeProdutos = contexto.Produto;
                return listaDeProdutos.ToList();
            }
        }

        public Produto BuscarProdutoPorId(int id)
        {
            using (var contexto = new ContextoDeDados())
            {
                var produto = contexto.Produto.Find(id);
                return produto;
            }
        }
    }
}
