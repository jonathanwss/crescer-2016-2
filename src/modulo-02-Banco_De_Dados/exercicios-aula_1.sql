select * from CidadeAux;

truncate table CidadeAux;

drop table produto;

insert into CidadeAux (IDCidade, Nome, UF) select IDCidade, Nome, UF from Cidade;
 

   create table Produto(
		IDProduto int identity not null,
		Nome varchar(10) not null,
		Descricao varchar(40) not null,
		DataDaCriacao datetime default getDate() not null,
		LocalNoEstoque varchar(30) not null,
		Quantidade decimal(7,3) not null,
		Preco decimal(7,2) not null,
			constraint PK_Produto primary Key(IDProduto)
		);

		insert into Produto (Nome, Descricao, DataDaCriacao, LocalNoEstoque, Quantidade, Preco) 
		values('Shamp','SHAMPO SEDA',convert(datetime,'16/09/1998',103),'Fundos',2000,3.50);

		insert into Produto (Nome, Descricao, LocalNoEstoque, Quantidade, Preco) 
		values('Shamp','SHAMPO DOVE','Fundos',2000,10.50);

		select * from Produto;

		select * from Produto;

