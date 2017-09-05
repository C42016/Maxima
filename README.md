# Maxima
1. Um fabricante de produtos eletrônicos para a área de informática deseja um sistema que permita a simulação de seus produtos em etapa de projeto. Os produtos a serem testados são: computadores e impressoras, os quais possuem em comum as características: Nº de Série e Tipo (ex.: pessoal ou corporativo). Da mesma forma, também são comuns as funcionalidades:  Ligar  e Desligar.   
 
a) O produto "computador" é especificado da seguinte forma:  • método Ligar deve exibir a mensagem: "O computador está pronto para uso".   • método Desligar deve exibir a mensagem: "O computador já pode ser desligado com segurança".    • computador possui uma característica própria que descreve sua Velocidade de Processamento (ex. 3GHz). E um método próprio chamado de Processar, que deve exibir a mensagem: "Computador processando".   
 
b) O produto "impressora" é especificado da seguinte forma: • método Ligar deve exibir a mensagem: "A impressora está pronto para receber documentos".   • método Desligar deve exibir a mensagem: "A impressora não está mais disponível".  • A impressora possui uma característica própria que armazena uma descrição sobre Velocidade de Impressão (ex. 6 ppm). E um método próprio chamado de Imprimir que deve exibir a mensagem: "A impressora está em uso".    
 
c) Implemente uma classe Simulação de Testes que disponibilize um método Simular para teste de produtos. Este método deve receber um produto, sem saber de qual tipo, e proceder com a ativação dos métodos Ligar e Desligar, e também dos métodos inerentes a cada tipo, por exemplo, método Processar do produto Computador e o Imprimir da Impressora. Adicionalmente, esse método deve exibir os dados (atributos) de cada produto testado. 
 
