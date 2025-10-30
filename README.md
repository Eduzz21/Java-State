Implemente o requisito abaixo:
Uma empresa está desenvolvendo um sistema de gestão de pedidos online para uma loja virtual.
Cada pedido (Order) pode estar em um de vários estados ao longo do seu ciclo de vida:
Novo – o pedido foi criado, mas ainda não foi pago.
Pago – o pagamento foi confirmado e o pedido está aguardando envio.
Enviado – o pedido foi despachado para o cliente.
Entregue – o pedido foi recebido pelo cliente.
Cancelado – o pedido foi cancelado.
Cada estado define comportamentos diferentes para as ações possíveis no sistema, como:
pagar() — registrar o pagamento do pedido.
enviar() — despachar o pedido.
entregar() — confirmar a entrega ao cliente.
cancelar() — cancelar o pedido.
