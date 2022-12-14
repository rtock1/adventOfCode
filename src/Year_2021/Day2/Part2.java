package Year_2021.Day2;

public class Part2 {
    public String start(String input) {
        String[] d = input.split("\\n");
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        for (String a : d) {
            if (a.split(" ")[0].equals("forward")){
                horizontal += Integer.parseInt(a.split(" ")[1]);
                depth += aim * Integer.parseInt(a.split(" ")[1]);
            } else if (a.split(" ")[0].equals("down")){
                aim += Integer.parseInt(a.split(" ")[1]);
            } else if (a.split(" ")[0].equals("up")){
                aim -= Integer.parseInt(a.split(" ")[1]);
            } else {
                System.out.println("error");
            }
        }
        return (horizontal* depth) + "";
    }
}
