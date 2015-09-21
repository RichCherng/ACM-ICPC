import java.text.DecimalFormat;
import java.util.Scanner;


class ClockHands {
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		while(reader.hasNext()){
			String input = reader.nextLine();
			if(input.equals("0:00"))
				break;
			String[] time = input.split(":");
			//System.out.println(time[0] + time[1]);
			int hour = Integer.parseInt(time[0]);
			int min = Integer.parseInt(time[1]);
			double a = (hour + (min/60.0)) * 30;
			double b = (min/5.0) * 30;
			double ans = 0;
			if(a > b)
			{
				ans = a - b;
			}
			else
			{
				ans = b -a;
			}
			ans = (ans > 180) ? 360-180 : ans;
			System.out.println(ans);
			/*
			double h_angle = (double)((hour)*5)*6 - 6;
			if(hour == 12){
				h_angle = 0;
			}
			double m_angle = (double)min*6;
			h_angle += 6.0 * (m_angle/360);
			if(m_angle == 0.0 && hour != 12){
				h_angle += 6;
			}
			double angle = Math.abs(h_angle - m_angle);
			angle = (h_angle + (min/60))*30 - (min/5 * 30);
			angle = Math.abs(angle);
			angle = minAngle(angle);
			System.out.printf("%.3f%n", angle);*/
		}
	}
	
	public static double minAngle(double angle){
		double min = 360.00 - angle;
		return min < angle? min:angle;
	}
}
