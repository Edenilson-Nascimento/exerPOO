package br.com.generation.Atividades4;
/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
   esta classe, em seguida crie um objeto cliente, defina as instancias deste
   objeto e apresente as informações deste objeto no console.
 */
 public class Cliente {
	   public String nome;
       public String endereco;
	   public String pedido;
	 
	 
	 public static void main (String[] args) {
		 	Cliente cliente1 = new Cliente();
		 	cliente1.nome = "Nascimento";
		 	System.out.println("O Cliente " + cliente1.nome);
		 	
		 	pedir();
		 	statusPedido();
		 	ondeEntregar();
		 	
		 	
		
	 }
	 
	 public static void pedir() {
		 String pedido = "Pizza";
		 System.out.print("Pediu " + pedido);
		 
	 }
	 
	 public static void statusPedido() {
		 Boolean entrega = true;
		 System.out.println(", o status do pedido é: " + entrega);
	 }
	 
	 public static void ondeEntregar() {
		 String endereco = "Guarulhos";
		 System.out.println("O local de entrega é " + endereco);
	 }
	

	
}

	