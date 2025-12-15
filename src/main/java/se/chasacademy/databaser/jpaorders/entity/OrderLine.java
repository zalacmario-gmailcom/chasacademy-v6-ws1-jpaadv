package se.chasacademy.databaser.jpaorders.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_order_line")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_line_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "line_number", nullable = false)
    private Integer lineNumber;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "line_total_cents", nullable = false)
    private Integer lineTotalCents;

    //constructor
    public OrderLine() {
    }

    public OrderLine(Order order, Integer integer, Product product, Integer qty, Integer lineTotalCents){
        this.order = order;
        this.lineNumber = integer;
        this.product = product;
        this.qty = qty;
        this.lineTotalCents = lineTotalCents;
    }

    public OrderLine(long id, Order order, Integer integer, Product product, Integer qty, Integer lineTotalCents){
        this.id = id;
        this.order = order;
        this.lineNumber = integer;
        this.product = product;
        this.qty = qty;
        this.lineTotalCents = lineTotalCents;
    }

    //getters och setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getLineTotalCents() {
        return lineTotalCents;
    }

    public void setLineTotalCents(Integer lineTotalCents) {
        this.lineTotalCents = lineTotalCents;
    }
}
