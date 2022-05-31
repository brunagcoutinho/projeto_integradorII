-- Criação do relatório sintético
-- Versão 3.0
-- Consultar a procedure no caso de alteração e validar as informações com o banco.

CREATE PROCEDURE p_RelSintetico (vendedor smallint, dataMin date, dataMax date)
SELECT 
pd.cd_pedido,
(pdd.quantidade * pt.preco) as Total,
pd.dataVenda,
cd.nm_cliente
FROM pedido pd
JOIN pedido_detalhe pdd on pd.cd_pedido = pdd.cd_pedido
JOIN produto pt on pdd.cd_produto = pt.cd_produto
JOIN vendedor vd on pd.cd_vendedor = vd.cd_vendedor
JOIN cliente cd on pd.cd_cliente = cd.cd_cliente
WHERE vd.cd_vendedor = vendedor
AND pd.dataVenda between dataMin and dataMax
ORDER BY dataVenda asc;

CALL p_RelSintetico (2, '2022-05-25', '2022-05-29');

drop procedure p_RelSintetico;