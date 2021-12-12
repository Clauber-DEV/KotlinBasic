package moreclasses.basic

import moreclasses.basic.Basic.Aula06.am
import moreclasses.basic.Basic.Aula06.az
import moreclasses.basic.Basic.Aula06.b
import moreclasses.basic.Basic.Aula06.c
import moreclasses.basic.Basic.Aula06.m
import moreclasses.basic.Basic.Aula06.r
import moreclasses.basic.Basic.Aula06.vd
import moreclasses.basic.Basic.Aula06.vm
import java.lang.Math.*
import java.time.LocalDateTime
import kotlin.math.pow
import kotlin.math.roundToInt

class Basic {
    object Aula01 {
//        comandos basicos no kotlin
//
//        \n nova linha
//        \t tabulação (colocar dados em coluna ou tabela)
//        \b backspace
//        \r retorno e sobre põe o texto
//        \\ para mostrar uma contrabarra em uma string
//        \" para mostrar aspas em uma string
//        println() escreve o texto e pula para a linha de baixo


        fun main() {
            print("Kotlin é \n \"SUPER\" \n Facil!")
        }


//
//        tipos de comentarios
//        deve se colocar os comandos no inicio e no final exp: /*comantario*/
//        \\ uma linha
//        \* para varias linhas
//        \** KDoc para documentação do sistema
        /**
        Tipos primitivos

        Int:
        Byte para numeros pequenos de -128 a 127
        Short para -32000 a 32000
        Int para 2 elevado 31
        Long para até quintilhão

        Float:
        Float para poucos numeros depois da virgula ou ponto
        Double para muitos numeros depois da virgula "gasta o dobro de memória"

        Char:
        Char para appenas uma letra
        String para conjunto de letras

        Boolean:
        Boolean tebela booleana para tipos verdadeiros ou falços

        Array:
        Array para vetores

        Any:
        Any para referenciar todos os outros tipos de comandos.
         */


    }

    object Aula02 {

        /**
         *var idade:Short = 19
         *var nome:String = "Zé"
         *var casado:Boolean = false
         *var madia:Float = 9.5F

        Regras para nomear identificadores no Kotlin
         *Comaçar com uma letra ou sublinhado
         *Maiúsculas ou minúsculas fazem a diferença
         *Só usa letras, números o sublinhado
         *podemos usar acentos
         *Não pode conter espaços
         *Não pode ter símbolos exeto o sublinhado
         *Não pode utilizar palavras reservadas para comandos como o print ou fan**/


//        exemplo:

        fun main() {
            var nome: String = "Clauber"
            var idade: Short = 40
            var peso: Float = 95.8F
            var nunGrande: Long = 5_000_000L // se coloca a letra do tipo da variavel no final do numero
            println(nome)
        }
    }

    object Aula03 {

//        Variaveis
//
//        Toda variavel tem nome, tipo e valor
//
//        var para variavel mutavel
//        val para variavel constante
//
//        Converção de variaveis

        //       ex01:
        fun main1() {
            var n1: Short = 7
            val n2: Int
            n2 = n1.toInt() //coloca to e a variavel q deseja transformar ex: Int Float Double

            println(n1)
            println(n2)
        }

        //      ex02:
        fun main2() {
            val n1 = 21.5F
            val n2: Double = n1.toDouble()

            println(n1)
            println(n2)
        }

        //Declareção de variaveis

        fun main3() {
            var x: Int = 10 //Declaração de tipo explicita
            var y = 20 //Declaração por inferencia ou indução
        }
    }

    object Aula04 {
        //        ? operador safe call para indicar se a variavel será nula ou não.
//        ex:
//        fun main() {
//            var nome:String?
//            nome = null
//        }
//
//        ?: operador Elvis só será nulo se a variavel anterior for nulo tbm e será representado por um simbolo
//        ex:
        fun main1() {
            var a: Int?
            var b: Int
            a = null
            b = a ?: 0
            println("a vale: " + a)
            println("b vale: " + b)
        }

        //        !! operador Null Checks permite que a operação seja retradada e não permite q o programa de erro
//        ex:
//        import java.lang.NullPointerException
        fun main2() {
            var a: Int?
            var b: Int = 0
            a = null
            try {
                b = a!!
            } catch (e: NullPointerException) {
                print("Deu um problema, mas estou resolvendo...")
                b = 10
            } finally { // tratamento
                println("a vale: " + a)
                println("b vale: " + b)
            }
        }

    }

    object Aula05 {

        fun main() {
            /*Strings cruas que usam """ e interpoladas que usam $
            e utilisa {} para efetuar uma expreção dentro da string*/
            val ano = 2021
            val nasc = 1986
            print(
                """você nasceu em $nasc. E hoje estamos em $ano. Então tens ${ano - nasc} anos. """
            )
        }
    }

    object Aula06 {

        //        comando para cores
//        \u001B[  m
//        entre a[ eo m se coloca o numero das cores
//
//        Atalho para cores
        val r = "\u001B[00m"//reset
        val p = "\u001B[30m"//preto
        val vm = "\u001B[31m"//vermelho
        val vd = "\u001B[32m"//verde
        val am = "\u001B[33m"//amarelo
        val az = "\u001B[34m"//azul
        val m = "\u001B[35m"//magenta
        val c = "\u001B[36m"//ciano
        val b = "\u001B[37m"//branco

        //ex:
        fun main() {
            val ano = 2021
            val nasc = 1986
            val vm = "\u001B[31m"//vermelho
            val am = "\u001B[33m"//amarelo
            print(
                """${am}Você nasceu em ${vm}$nasc${am}. 
                E hoje estamos em ${vm}$ano${am}.
                Então tens${vm} ${ano - nasc} ${am}anos. """.trimMargin()
            )
        }

    }

    object Aula07 {

        fun main() {
            println("Olá!")
            println("Qual o seu nome?")
            val nome: String = readLine()!! //os !! dispara um condição
            println("Pazer em te conhecer, $nome! \n Quantos anos vc tem? ")
            val idade: Int = readLine()!!.toInt()// toIntconverção de tipo
            print("Você é $nome e tem $idade anos de idade.")
        }
    }

    object Aula08 {

        fun main() {
            print("digite um valo: ")
            val n1: Int =
                readLine()!!.toIntOrNull() ?: 0 // esse toIntOrNull é para caso não seja um valor inteiro será nulo
            print("Digite outro valor: ")
            val n2: Int = readLine()!!.toIntOrNull() ?: 0
            val s = n1 + n2
            print("resultado $s")
        }
    }

    object Aula09 {

//        + .plus()
//        - .minus()
//        * .times()
//        / .div()
//        % .mod()


        //ex:
        fun main1() {
            print("digite um valor:")
            val n1: Int = readLine()!!.toInt()
            print("digite outro valor:")
            val n2: Int = readLine()!!.toInt()
            println("$n1 + $n2 = ${n1 + n2}") //mesmos que .plus()
            println("$n1 - $n2 = ${n1 - n2}") //mesmo que .minus()
            println("$n1 * $n2 = ${n1 * n2}") //mesmo que .times()
            println("$n1 / $n2 = ${n1.toFloat() / n2}") //mesmo que .div()
            println("$n1 % $n2 = ${n1 % n2}") //mesmo que .rem ou .mod()
        }


        //ex2:

        fun main2() {
            println("Raiz quadrada: ${sqrt(25.0)}")
            println("Potencia: ${7f.pow(2)}")
            println("Arredonda pra cima:${ceil(8.1)} ")
            println("Arredonda: ${8.2f.roundToInt()}")
            println("Arredonda pra baixo: ${floor(8.8)}")
            println("Maior: ${max(7, 9)}")
            println("Menor: ${min(7, 9)}")
        }
    }

    object Aula10 {

        //        > maior
//        >= maior ou igual
//        < menor
//        <= menor ou igual
//        == igual
//        != diferente
//
//        ex:
        fun main1() {
            print("digite um numero:")
            val n1: Int = readLine()!!.toInt()
            print("digite outro numero:")
            val n2: Int = readLine()!!.toInt()
            println("$n1 maior que $n2? ${n1 > n2} ")
            println("$n1 manor que $n2? ${n1 < n2}")
            println("$n1 maior ou igual a $n2? ${n1 >= n2}")
            println("$n1 menor ou igual a $n2? ${n1 <= n2}")
            println("$n1 igual a $n2? ${n1 == n2}")
            println("$n1 diferente de $n2? ${n1 != n2}")
        }

        //        += .plusAssign()
//        -+ .minusAssign()
//        *+ .timesAssign()
//        %= .modAssign()
//
//
//        a+=b é o mesmo que a=a+b ou a.plusAssign(b)
//        x/=5 é o mesmo que x=x/5 ou x.divAssign(5)
//
//
//
//        operadores de incremento e decremento
//        incremento
//        ++.inc() a++ é o mesmo que a=a+1 ou a=a.inc()
//        decremento
//        --.dec() a-- é o mesmo que a=a-1 ou a=a.dec()
//
//        se o ++ ou -- estiver dentro de uma expreção ficará assim:
//        antes: ++a  é um preincremento será feito antes da execução
//        depois: a++ é um pos incremento será depois de execução
//
//        antes: --a  é um predecremento será feito antes de execução
//        depois: a-- é um posdecremento será feito depois da execução
//
//        ex:
        fun main2() {
            var n = 3
            var d = 4
            var c = 5
            val res = n++ + --d + ++c
            println("A Variàvel tem o valor de $n, $d e $c")
            print("$res")
            /*sairá o resuldado da operação de todos que tiverem os sinais a esquerda
            e só depois será feito a operação dos q tem os sinais a direita
            sequencia logica:
            res = n 3 + d 1-4 + c 1+5 = 12 só depois disso ele fará n 3+1 = 4*/


        }
    }

    object Aula11 {
        //        && conjunção
//        || disjunção ou seperação
//        ! nagação ou não
//
//        Tabela verdade
//
//        conjunção &&
//        a b a&&b
//        v v  v
//        v f  f
//        f v  f
//        f f  f
//        se tiver um falso todos serão falso
//
//        disjunção ||
//        a b a||B
//        v v  v
//        v f  v
//        f v  v
//        f f  f
//        se tiver um verdadeiro todos serão verdadeiros
//
//        negação !
//        a !a
//        v  f
//        f  v
//        uma coisa não verdadeira é falsa uma coisa não falsa é verdadeira.
//
//        ordem de precedencia
//
//        parenteses ()
//        aritimeticos * / % + -
//        relacionais == > < >= <= *= !=
//        lógicos ! && ||
//
//        ex:
        fun main1() {
            val v1 = 5
            val v2 = 8
            val v3 = 3
            val v4 = 2
            val res = v1 > v2 && !(v3 - 1 != v1 / v4)
            print("resultado é $res")
        }
//      sequencia logica:
//      (v1/v4==5/2=2 != v3-1==2)!falso v1>v2 falso
//       res falso
    }

    object Aula12 {

        fun main() {
            val n1: Int = (0..100).random() //Os .. indica q será de um número até outro número
            print("O valor sorteado é:$n1")
        }
    }

    object Aula13 {

        fun main() {
            val dh = LocalDateTime.now()
            println("Dia atual:${dh.dayOfMonth}")
            println("Mes atual:${dh.monthValue}")
            println("Ano atual:${dh.year}")
            println("___________")
            println("Hora atual:${dh.hour}")
            println("Minuto atual:${dh.minute}")
            println("Segundo atual:${dh.second}")
        }
    }

    object Exercicios01 {

        fun main1() {
            println("""$vm _____________________________________""")
            println("$vm        CADASTRO ESTUDONAUTA")
            println("$vm _____________________________________")
            print("$vd Nome do funcionario: ")
            val n1: String = readLine()!!
            print("$vd Ano de nascimento: ")
            val n2: Int = readLine()!!.toInt()
            print("$vd Salário: R$")
            val n3: Float = readLine()!!.toFloat()
            println("$am ---------- FICHA FUNCIONAL ----------")
            println("$am Nome:       $n1\n Nascimento: $n2\n Salário:    R$$n3")
            print("$am -------------------------------------")
        }
    }

    object Exercicios02 {

        fun main1() {
            println("$vm ___________________________")
            println("$vm        DOIS VALORES        ")
            println("$vm ___________________________")
            print("$vd Valor 1:")
            val n1: Int = readLine()!!.toInt()
            print("$vd Valor 2:")
            val n2: Int = readLine()!!.toInt()
            println("$am __________VALORES__________")
            println("$am Soma:           $az$n1 + $n2 =$m${n1 + n2}")
            println("$am Subtração:      $az$n1 - $n2 =$m${n1 - n2}")
            println("$am Multiplicação:  $az$n1 * $n2 =$m${n1 * n2}")
            println("$am Divisão:        $az$n1 / $n2 =$m${n1 / n2.toFloat()}")
            println("$am Modulo:         $az$n1 % $n2 =$m${n1 % n2}")
            println("$am ___________________________")
        }
    }

    object Exercicios03 {
        fun main1() {
            println("$vm ___________________________")
            println("$vm      NOTAS ESTUDONAUTA     ")
            println("$vm ___________________________$r")
            print("Nota:")
            val n1: Float = readLine()!!.toFloat()
            print("Nota:")
            val n2: Float = readLine()!!.toFloat()
            println("$am ____________RESULTADOS___________")
            println(" As notas do aluno(a) foram, $b$n1$am e $b$n2$am.")
            println("$am A media será:$b${(n1 + n2) / 2}")
            print("$am _________________________________")
        }
    }

    object Exercicios04 {

        fun main() {
            println("$vm ___________________________")
            println("      CALCULO DE POTENCIA     ")
            println(" ___________________________$r")
            print("Base:")
            val n1: Float = readLine()!!.toFloat()
            print("Expoente:")
            val n2: Int = readLine()!!.toInt()
            println("$am ____________RESULTADOS___________")
            println(" Calculando $b${n1.toInt()}$am elevado a $b$n2$am.")
            println("$am O resultado será:$b${n1.pow(n2)}")
            print("$am _________________________________")
        }
    }

    object Exercicios05 {

        fun main() {
            println("$vm ____________________")
            println("   RAJUSTE SALARIAL")
            println("$vm ____________________$r")
            print("Salario atual:")
            var n1: Float = readLine()!!.toFloat()
            print("Reajuste em %:")
            var n2: Float = readLine()!!.toFloat()
            var n3 = (n1 / 100) * n2
            var n4 = n1 + n3
            println("$am Salario atual,R$$n1")
            println(" Com reajuste de $n2%")
            print(" Passará a ganhar R$$n4")
        }
    }

    object Exercicios06 {

        fun main() {
            println("$c ___________________")
            println(" BANCO ESTUDONAUTA")
            println(" ___________________")
            print("$vd Que valor você quer sacar? R$$r")
            val n1: Int = readLine()!!.toInt()
            val n2 = n1 / 50
            val n3 = n1 % 50 / 10
            val n4 = n1 % 50 % 10 / 2
            val n5 = n1 % 50 % 10 % 2 / 1
            print(
                """$am _________SAQUE REALIZADO_________
            $vd R$50,00    = $az$n2$r
            $vd R$10,00    = $az$n3 cédula(s)$r
            $vd R$02,00    = $az$n4 cédula(s)$r
            $vd R$01,00    = $az$n5 cédula(s)
            ${am}_________________________________ """
            )
        }
    }
    object Exercicios07{

        fun main() {
            println("${vm}__________________________")
            println("      TENTE ADVINHAR")
            println("__________________________")
            println("${az}Vou pensar em um numero de 0 a 5${r}")
            print("Seu palpite:")
            var n1:Int = readLine()!!.toInt()
            var n2:Int =(0..5).random()
            var n3 = n1 + n2
            var n4 = n3
            print("""Seu paltite foi:$n1
            O número sorteado é:$n2
            Adiferença é de $n4""")
        }
    }
    object Exercicios08{

        fun main() {
            println("${vm}__________________________")
            println("      SUA IDADE")
            println("__________________________$r")
            println("${az}Vou descobrir o ano em q vc nasceu$r")
            print("Ano q vc nasceu? ")
            val n1:Int = readLine()!!.toInt()
            val dh= LocalDateTime.now()
            val ano = dh.year
            val n2 = ano-n1
            println("${am}_______RESULTADO_______")
            println("Ano atual:${dh.year}")
            println("Você nasceu em $n1")
            println("Completa ${az}$n2 anos${r}${am} esse ano.")
            println("_______________________")
        }
    }
    object Exercicios09{

        fun main() {
            println("${vm}_______________________________________")
            println("        ANALISANDO A DATA ATUAL")
            println("_______________________________________$r")
            val dh= LocalDateTime.now()
            val mes = dh.monthValue
            val tri = (mes+2) / 3
            val si  = (mes+5) / 6
            println("${am}Data atual:${az}${dh.dayOfMonth}/${dh.monthValue}/${dh.year}${am}.")
            println("${am}Hora atual:${az}${dh.hour}:${dh.minute}:${dh.second}${am}.")
            println("${am}Esta data está no ${c}${tri}º trimestre${am} do ${c}${si}º semestre ${am}deste ano.")
            println("${vm}_______________________________________")
        }
    }
}
