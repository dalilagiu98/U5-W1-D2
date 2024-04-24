package dalilagiu9.U5W1D2;

import dalilagiu9.U5W1D2.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);
            Menù menù = ctx.getBean(Menù.class);

            menù.getMenù();

            Table t1 = (Table) ctx.getBean("Table1");
            Order order = new Order(3, t1);
            order.addItem(ctx.getBean("margherita", Pizza.class));
            order.addItem(ctx.getBean("hawaiian", Pizza.class));
            order.addItem(ctx.getBean("water", Drink.class));

            System.out.println(order);
            System.out.println(order.getTotal());
            ctx.close();
    }
}
