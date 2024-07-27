# 📐 Square of a Sorted Array

Este projeto resolve o problema do "Square of a Sorted Array". O problema consiste em receber um array de inteiros ordenados em ordem não decrescente e retornar um novo array com os quadrados de cada número, também ordenados em ordem não decrescente.

## Implementações

Foram implementadas duas soluções para o problema:

1. **🚀 Usando a biblioteca de streams do Java**
2. **🔄 Usando a técnica de dois ponteiros**

### 🚀 Usando a Biblioteca de Streams do Java

Nesta abordagem, utilizamos a biblioteca de streams do Java para mapear cada número para o seu quadrado e, em seguida, ordenamos o array resultante.

```java
public static int[] sortedSquares(int [] nums) {
    return Arrays.stream(nums)
                 .map(num -> num * num)
                 .sorted()
                 .toArray();
}
```

### 🔄 Usando a Técnica de Dois Ponteiros
Nesta abordagem, utilizamos dois ponteiros para comparar os quadrados dos valores nas extremidades do array. O ponteiro que aponta para o maior quadrado é movido em direção ao centro, preenchendo o array de saída de trás para frente.

```java
public static int[] twoPointersSquare(int[] nums) {
    var output = new int[nums.length];
    int head = 0, tail = nums.length - 1, index = tail;

    while (index >= 0) {
        var squaredHead = nums[head] * nums[head];
        var squaredTail = nums[tail] * nums[tail];

        if (squaredHead >= squaredTail) {
            output[index--] = squaredHead;
            head++;
        } else {
            output[index--] = squaredTail;
            tail--;
        }
    }

    return output;
}
```

## 🏃‍♂️ Executando o Código
Para executar o código, você pode usar o método main fornecido abaixo, que demonstra ambas as implementações:

```java
public class Main {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
        System.out.println(Arrays.toString(twoPointersSquare(nums)));
    }
}
```

## 🤝 Contribuição
Sinta-se à vontade para abrir issues e enviar pull requests para melhorar este projeto.
