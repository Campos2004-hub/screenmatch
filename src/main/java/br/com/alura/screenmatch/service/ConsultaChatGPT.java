//package br.com.alura.screenmatch.service;
//import com.theokanning.openai.completion.CompletionRequest;
//import com.theokanning.openai.service.OpenAiService;
//
//public class ConsultaChatGPT {
//
//        public static String obterTraducao(String texto) {
//            OpenAiService service = new OpenAiService("cole aqui sua chave da OpenAI");
//
//            CompletionRequest requisicao = CompletionRequest.builder()
//                    .model("gpt-3.5-turbo-instruct")
//                    .prompt("traduza para o português o texto: " + texto)
//                    .maxTokens(1000)
//                    .temperature(0.7)
//                    .build();
//
//            var resposta = service.createCompletion(requisicao);
//            return resposta.getChoices().get(0).getText();
//        }
//    }
//

//O motivo dessa classe ficar totalmente comentada
//é por conta de ser necessário utilizar tokens
//no chatgpt e você já tinha gasto no plano free.
//
//Seria usado para a tradução de sinopse da serie.
//
//
