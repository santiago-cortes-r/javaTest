package payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {

        // 1. Construye la petición con el monto
        PaymentRequest request = new PaymentRequest(amount);

        // 2. Llama al gateway para procesar el pago, En lugar de
        // que PaymentProcessor cree internamente un objeto concreto
        // de “pasarela de pago”, recibe una referencia a cualquier
        // implementación de la interfaz PaymentGateway.
        PaymentResponse response = paymentGateway.requestPayment(request);

        // 3. Verifica el estado devuelto
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;
        } else {
            return false;
        }
    }
}
