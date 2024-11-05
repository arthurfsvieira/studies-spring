# studies-spring
PRIMEIROS PASSOS

Para configurar um projeto Spring podemos utilizar o https://start.spring.io/ que ajuda a criar toda a estrutura de um projeto e suas dependências personalizadas.

A anotação `@SpringBootApplication` é uma **anotação composta** usada no Spring Boot para configurar e inicializar automaticamente uma aplicação Spring Boot. Ela simplifica a configuração e evita a necessidade de definir múltiplas anotações para configurar uma aplicação Spring Boot. Vamos detalhar o que ela faz:

### 1. **Composição de Anotações**

A `@SpringBootApplication` é, na verdade, uma combinação das seguintes três anotações:

- **@Configuration**: Indica que a classe define uma configuração de Spring. Classes anotadas com `@Configuration` podem declarar métodos que produzem beans, que serão gerenciados pelo contêiner do Spring.
- **@EnableAutoConfiguration**: Diz ao Spring Boot para configurar automaticamente os componentes com base nas dependências adicionadas ao projeto. Por exemplo, se você inclui uma dependência de banco de dados, o Spring Boot configura automaticamente o DataSource.
- **@ComponentScan**: Instrui o Spring para escanear o pacote onde a classe anotada está e seus subpacotes, permitindo a detecção automática de componentes (`@Component`), controladores (`@Controller`), serviços (`@Service`), e repositórios (`@Repository`).

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinhaAplicacao {

    public static void main(String[] args) {
        SpringApplication.run(MinhaAplicacao.class, args);
    }
}

```

### Em Resumo:

A anotação `@SpringBootApplication` ajuda a simplificar o código, encapsulando várias configurações automáticas e instruções de escaneamento do Spring, tornando mais fácil iniciar uma aplicação Spring Boot com uma configuração mínima.

**CONTROLLER:**

No Spring Boot, as anotações `@RestController` e `@RequestMapping` são fundamentais para a criação de APIs e a manipulação de requisições HTTP em controllers. Vamos detalhar cada uma:

### 1. `@RestController`

- **Finalidade**: Indica que a classe é um **controller RESTful**, responsável por manipular requisições HTTP e responder com dados (normalmente em JSON ou XML), em vez de redirecionar para uma página.
- **Composição**: Internamente, `@RestController` combina as funcionalidades de `@Controller` e `@ResponseBody`.
    - **@Controller**: Define que a classe é um componente Spring do tipo controlador, ou seja, que ela contém métodos que processam requisições.
    - **@ResponseBody**: Define que o valor de retorno dos métodos é convertido diretamente no corpo da resposta HTTP, sem precisar renderizar uma página de visualização.
- **Uso**: Com `@RestController`, métodos como `GET`, `POST`, `PUT` ou `DELETE` podem ser facilmente implementados, e a resposta geralmente é serializada em JSON para enviar dados ao cliente.

```java
@RestController
public class MeuController {
    @GetMapping("/saudacao")
    public String saudacao() {
        return "Olá, bem-vindo!";
    }
}
```

Nesse exemplo, a resposta seria "Olá, bem-vindo!" em texto JSON.

### 2. `@RequestMapping`

- **Finalidade**: Define o mapeamento de uma URL ou rota específica para uma classe ou método dentro do controller, indicando qual caminho responderá a uma solicitação HTTP.
- **Funcionalidade**: Pode ser usada tanto a nível de **classe** quanto de **método**:
    - **Nível de Classe**: Define a URL base para todos os endpoints da classe. Todos os métodos dentro do controller herdam esse caminho.
    - **Nível de Método**: Define rotas específicas para cada método, podendo incluir também o tipo de requisição HTTP (`GET`, `POST`, `PUT`, `DELETE`).
- **Atributos**:
    - **`value`**: Define a URL ou caminho específico.
    - **`method`**: Especifica o tipo de método HTTP (`RequestMethod.GET`, `RequestMethod.POST`, etc.).

```java
@RestController
@RequestMapping("/api")
public class ApiController {
    
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        // Retorna a lista de usuários
    }
}
```

Neste caso, a URL `"/api/usuarios"` mapeia o método `getUsuarios`, e o tipo de requisição é GET.

### Resumo

- **`@RestController`**: Configura a classe como um controller REST que lida com APIs.
- **`@RequestMapping`**: Define o mapeamento das URLs para a classe ou métodos, permitindo criar rotas e endpoints organizados para manipular as requisições.
