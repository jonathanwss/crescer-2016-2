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

select top 1 cid.UF, count(1) as NºHabitantes from Cliente as Cli
inner join Cidade as cid on cid.IDCidade = cli.IDCidade
group by cid.UF
order by NºHabitantes desc

select top 1 cida.UF, count(1) as NºHabitantes from Cliente as Cli
inner join Cidade as cida on cida.IDCidade = cli.IDCidade
group by cida.UF
order by NºHabitantes asc
;

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

select ped.* from Pedido as ped
inner join PedidoItem as pei on pei.IDPedido = ped.IDPedido
inner join Produto as prod on prod.IDProduto = pei.IDProduto
inner join ProdutoMaterial as prodmat on prodmat.IDProduto = prod.IDProduto
where Month(ped.DataEntrega) = 10 and Year(ped.DataEntrega) = 2016 and (
prodmat.IDMaterial = 14650 or prodmat.IDMaterial = 15703 or prodmat.IDMaterial = 15836 or prodmat.IDMaterial = 16003 or 
	  prodmat.IDMaterial = 16604 or prodmat.IDMaterial =  17226 )
	  ;
