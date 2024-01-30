package mop;

public abstract class Runnable_OverrideRun_1 implements Runnable {

    // Implementação do método run
    @Override
    public void run() {
        // Código a ser executado quando a thread é iniciada
        System.out.println("Executando o método run() sobrescrito.");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe MyConcreteRunnable dentro do método main
        MyConcreteRunnable example = new MyConcreteRunnable();

        // Criando uma thread passando a instância de MyConcreteRunnable como argumento
//        Thread thread = new Thread(example);

        // Iniciando a thread
//        thread.start();
    }

    public static class MyConcreteRunnable extends Runnable_OverrideRun_1 {
//        @Override
//        public void run() {
//            // Implementação do método run()
//            System.out.println("Executing run() method in MyConcreteRunnable");
    	
//        }
    	
    	public MyConcreteRunnable() {
			// TODO Auto-generated constructor stub
		}
    }

}
