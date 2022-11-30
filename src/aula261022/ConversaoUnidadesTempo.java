package aula261022;

public class ConversaoUnidadesTempo {
	
	public static int MinutoParaSegundo(int min) {
		return min * 60;
	}
	
	public static int HoraParaMinuto(int hora) {
		return hora * 60;
	}
	
	public static int DiaParaHora(int dia) {
		return dia * 24;
	}
	
	public static int SemanaParaDia(int semana) {
		return semana * 7;
	}
	
	public static int MesParaDia(int mes) {
		return mes * 30;
	}
	
	public static double AnoParaDia(double ano) {
		return ano * 365.25;
	}

}
