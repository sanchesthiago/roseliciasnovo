
# Interface Collection - SET

SET é uma interface que faz parte do pacote “java.util” e representa grupos de elementos que   são usados quando o programador não precisar ter nenhum dado duplicado na coleção
## LIS e SET são a mesma coisa?
Não. Apesar de ambos armazenarem uma “lista”. A diferença principal é que o 'Set' não aceita elementos duplicados, diferente do List.

## Características - Collection Set

- Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;

- Permite trabalhar com conjuntos e pode ser implementado como instâncias das classes HashSet ou TreeSet;

- Não precisa especificar a posição para adicionar um elemento;

- Não aceita valores duplicados. Se caso inserir um registro que já tenha no Set não será adicionado.

- Podem ser implementados como instâncias das classes HashSet ou TreeSet;



  
## Características da Implementações: HashSet, TreeSet e LinkedHashSet
### HashSet
Com o **HashSet** o acesso aos dados é mais rápido que em um **TreeSet**, porem não os dados estarão ordenados. Escolha este conjunto quando a solução exigir elementos únicos e a ordem não for importante. 
- Não tem ordenação na varredura ou impressão. A ordem de saída não é a mesma de entrada;

- Aceitam valores do tipo null

- Não é sincronizada (thread-safe);

- Velocidade no acesso, leitura e modificação de dados;

### TreeSet
No **TreeSet** os dados são classificados, mas o acesso é mais lento que em um **HashSet**. Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural, prefira o TreeSet. É recomendado utilizar esta coleção para as mesmas aplicações de HashSet, com a vantagem dos objetos estarem em ordem natural;
- Os elementos inseridos dentro desse tipo de conjunto devem implementar a interface Comparable;

- A ordenação é por elementos únicos;

- Não suporta objetos nulos, se caso um elemento ser nulo é lançado a exceção NullPointerException;

### LinkedHashSet
**LinkedHashSet** é derivada de **HashSet**, mas mantém uma lista duplamente ligada através de seus itens. Seus elementos são iterados na ordem em que foram inseridos. Opcionalmente é possível criar um **LinkedHashSet** que seja percorrido na ordem em que os elementos foram acessados na última iteração. Poderíamos usar esta implementação para registrar a chegada dos corredores de uma maratona;
- Boa performance 
- Pode ser ordenada.
- Elementos continuam na ordem que são inserido

  ## Sintaxe e exemplos HashSet e TreeSet; - Set

###### HashSet:

**Sintaxe:** HashSet<E> set = new Type<E>();
###### TreeSet:
**Sintaxe:** Set<E> set = new TreeSet<E>();
###### TreeSet:
**Sintaxe:** LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
#### **Exemplo uso HashSet**

```javascript
import Component from 'my-project'

import java.util.HashSet;
import java.util.Iterator;
 
public class TestesHashSet {
 
    public static void main(String[] args) {
        HashSet<Cliente> hsc = new HashSet<Cliente>();
        hsc.add(new Cliente("João Delfino","Rua da Várzea","3232-1232"));
        hsc.add(new Cliente("Maria Tijuca","Av. Brasil","8569-99988"));
        hsc.add(new Cliente("Pedro de Lara","Rua 20 de março","7568-8524"));
         
        Cliente clienteJoao = new Cliente("João Delfino","Rua da Várzea","3232-1232");
        if(hsc.contains(clienteJoao)){
            System.out.println("Existe o cliente João Delfino");
        }
         
        System.out.println("Tamanho coleção HashSet: "+hsc.size());
         
        //Percorrendo o HashSet<Cliente> e imprimindo os valores
        Iterator<Cliente> it = hsc.iterator();
        while(it.hasNext()){
            Cliente valorCliente = (Cliente)it.next();
            System.out.println(valorCliente);
        }
    }
}
```

#### **Exemplo uso TreeSet**

```javascript
import Component from 'my-project'

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
public class TesteTreeSet {
    public static void main(String[] args) {
        Set<Cliente> hsc = new HashSet<Cliente>();
        hsc.add(new Cliente("Pedro de Lara","Rua 20 de março","7568-8524"));
        hsc.add(new Cliente("João Delfino","Rua da Várzea","3232-1232"));
        hsc.add(new Cliente("Maria Tijuca","Av. Brasil","8569-99988"));
 
         
        Set<Cliente> ordena = new TreeSet<Cliente>(hsc);
        Iterator<Cliente> it = ordena.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         
    }
}

```

#### **Exemplo uso LinkedHashSet**

```javascript
import Component from 'my-project'
 import java.util.LinkedHashSet;
public class AddElementsLinkedHashSet {
  public static void main(String[] args) {
    LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
    lh.add(20);
    lh.add(30);
    lh.add(10);
    lh.add(50);
    lh.add(40);
    
    System.out.println("Elements in the Set after add method: " + lh);
    
    LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
    l.add(60);
    l.add(80);
    
    lh.addAll(l);
    System.out.println("Elements in the Set after addAll method: " + lh);
  }
}
Elements in the Set after add method: [20, 30, 10, 50, 40]
Elements in the Set after addAll method: [20, 30, 10, 50, 40, 60, 80]

```


 
## Referências

Referencias para elaboração do trabalho

[Site: linhadecodigo - interface Set Java](http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx)

[Site: Devmedia - Como utilizar collections Java](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)

   
