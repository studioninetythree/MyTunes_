package MyTunes;

@Configuration
@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
