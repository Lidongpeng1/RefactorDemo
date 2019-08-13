package rentalstore;

public abstract class Statement {
    public String statement(rentalstore.Customer customer) {
        String result = getHeader(customer);
        for (Rental each : customer.getRentals()) {
            result = getEachLine(each,result);
        }
        result = getFooter(customer, result);
        return result;
    }

    protected abstract String getFooter(Customer customer, String result);

    protected abstract String getEachLine(Rental each, String result);

    protected abstract String getHeader(Customer customer);

}
