package collections.map;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {


        System.out.println("\nCrie um dicionário e relacione os estados e suas populações: ");
        Map<String, Long> estadosBrasileiros = new HashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        System.out.println(estadosBrasileiros.toString());

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosBrasileiros.put("RN", 3534165L);
        System.out.println(estadosBrasileiros);


        System.out.println("\nConfira se o estado PB está no dicionário: " + estadosBrasileiros.containsKey("PB"));
        System.out.println("\nAdicione: PB - 4.039.277: " + estadosBrasileiros.put("PB", 4039277L));

        System.out.println("\nExiba a população de PE: " + estadosBrasileiros.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Long> estadosBrasileiros1 = new LinkedHashMap<>() {{
                put("PE", 9616621L);
                put("AL", 3351543L);
                put("CE", 9187103L);
                put("RN", 3534265L);
            }};
        System.out.println(estadosBrasileiros1.toString());

        System.out.println("\nExiba os estados e suas populações em ordem alfabética");
        Map<String, Long> estadosBrasileiros2 = new TreeMap<>(estadosBrasileiros);
        System.out.println(estadosBrasileiros2.toString());


        System.out.println("\n");
        long populacaoMenor = Collections.min(estadosBrasileiros2.values());
        String estado = "";
        for (Map.Entry<String, Long> entry: estadosBrasileiros2.entrySet()) {
            if(entry.getValue().equals(populacaoMenor)) {
                estado = entry.getKey();
                System.out.println("Estado com menor população: " + estado);
                System.out.println("Quantidade: " + populacaoMenor);
            }
        }
    }
}
