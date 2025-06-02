package br.com.challenge.conversordemoedas.modelos;

public record CamposMoeda(String base_code, String target_code, double conversion_result) {
    @Override
    public String toString() {
        return "[" + base_code + "]" + ", corresponde ao valor final de: " +
                conversion_result + "[" + target_code + "]";
    }
}
