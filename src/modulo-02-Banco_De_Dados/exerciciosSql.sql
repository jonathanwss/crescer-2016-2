--Questão 1--

select count(1) from pedido where Month(DataPedido) = 9 and Year(DataPedido) = 2016;

--Questão 2--
select p.Nome from Produto as p
 inner join ProdutoMaterial promat on p.IDProduto = promat.IDProduto and promat.IDMaterial = 15836;

--Questão 3--

select nome, RazaoSocial from cliente where nome like '%LTDA' or RazaoSocial like '%LTDA';

--Questão 4--

insert into Produto (Nome, PrecoCusto, PrecoVenda, Situacao) values ('Galocha Maragato',35.67,77.95,'A');

--Questão 5--


select pro.nome from Produto as Pro where not exists 
( select IDProduto from PedidoItem where IDProduto = pro.IDProduto )

--Questão 6--
select * from (select top 1 cid.UF, count(1) as NºHabitantes from Cliente as Cli
inner join Cidade as cid on cid.IDCidade = cli.IDCidade
group by cid.UF
order by NºHabitantes desc) maior
union
select * from (select top 1 cida.UF, count(1) as NºHabitantes from Cliente as Cli
inner join Cidade as cida on cida.IDCidade = cli.IDCidade
group by cida.UF
order by NºHabitantes asc) menor

--Questão 7--

select cli.Nome, ped.IDPedido, ped.DataEntrega, ped.ValorPedido, pei.Quantidade from Pedido as ped
inner join PedidoItem as pei on pei.IDPedido = ped.IDPedido
inner join Cliente as cli on cli.IDCliente = ped.IDCliente
inner join Produto as prod on prod.IDProduto = pei.IDProduto
inner join ProdutoMaterial as prodmat on prodmat.IDProduto = prod.IDProduto
where Month(ped.DataEntrega) = 10 and Year(ped.DataEntrega) = 2016 and (
prodmat.IDMaterial = 14650 or prodmat.IDMaterial = 15703 or prodmat.IDMaterial = 15836 or prodmat.IDMaterial = 16003 or 
	  prodmat.IDMaterial = 16604 or prodmat.IDMaterial =  17226 )
	  ;

--Questão 8--

select prod.nome from Produto as prod
 where not exists(select 1 from ProdutoMaterial as pm,
  Material as mat where prod.IDProduto = pm.IDProduto)

--Questão 9--

select MAX(SUBSTRING(nome, 1, charindex(' ',Nome) - 1)) from Cliente


--Questão 10--

begin tran

update Prod set Situacao = 
						case
							when prodmat.IDMaterial = 14650 or
								 prodmat.IDMaterial = 15703 or
								 prodmat.IDMaterial = 15836 or
								 prodmat.IDMaterial = 16003 or 
								 prodmat.IDMaterial = 16604 or
								 prodmat.IDMaterial =  17226
							 then 'F'

							 when not exists(select * from Produto where (Month(ped.DataPedido) = 10 and Year(ped.DataPedido) = 2016) or (Month(ped.DataPedido) = 9 and Year(ped.DataPedido) = 2016))
							 then 'Q'
							 else
							 'A'
							end
 from Produto as Prod
inner join ProdutoMaterial as prodmat on prodmat.IDProduto = prod.IDProduto
inner join PedidoItem as pei on pei.IDProduto = Prod.IDProduto
inner join Pedido as ped on ped.IDPedido = pei.IDPedido;


rollback

