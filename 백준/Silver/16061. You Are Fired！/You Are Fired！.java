import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static class Employee {

        private String name;
        private int salary;

        public Employee(String name, String salary) {

            this.name = name;
            this.salary = Integer.parseInt(salary);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Employee[] employees = new Employee[n];
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String salary = st.nextToken();

            employees[i] = new Employee(name, salary);
        }

        Arrays.sort(employees, Comparator.comparingInt(employee -> employee.salary));
        for(int i = n - 1; i >= 0; i--) {

            Employee employee = employees[i];

            if(k < 0 || d <= 0) break;
            d -= employee.salary;
            k--;
            list.add(employee.name);
        }

        if(k < 0 || d > 0) System.out.println("impossible");
        else {

            System.out.println(list.size());
            for(int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i) + ", YOU ARE FIRED!");
            }
        }

    }
}