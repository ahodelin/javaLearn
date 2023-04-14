public class GlobalWarmingFactsQuiz{

  private String[] questions = {"What is global warming?", "What are the main causes of global warming?", 
    "How does global warming affect the environment?", "What are the consequences of global warming for human health?",
    "What can be done to mitigate global warming?"
  };

   // 2
   private String[] answers_to_1 = {
  "Global warming refers to the long-term increase in Earth's average surface temperature due to animal activities, primarily the emission of greenhouse gases such as carbon dioxide (CO2), methane (CH4), and nitrous oxide (N2O) into the atmosphere.", 
  "Global warming refers to the long-term increase in Earth's average surface temperature due to human activities, primarily the emission of greenhouse gases such as carbon dioxide (CO2), methane (CH4), and nitrous oxide (N2O) into the atmosphere.",
   "Global warming refers to the long-term increase in Earth's average surface temperature due to human activities, primarily the emission of greenhouse gases such as carbon dioxide (CO2), sugar, and nitrous oxide (N2O) into the throposphere.",
   "Global warming refers to the short-term decrease in Earth's average surface temperature due to human activities, primarily the emission of greenhouse gases such as carbon dioxide (CO2), methane (CH4), and nitrous oxide (N2O) into the atmosphere."
   };

   // 1
   private String[] answers_to_2 = {
     "The main causes of global warming are human activities, particularly the burning of fossil fuels such as coal, oil, and natural gas for energy production, transportation, and industrial processes. Deforestation, industrial and agricultural activities, and livestock production also contribute to greenhouse gas emissions and exacerbate global warming.",
     "The main causes of global warming are animal activities. Deforestation, industrial and agricultural activities, and livestock production also contribute to greenhouse gas emissions and exacerbate global warming.",
     "The main causes of global warming are human activities, particularly the burning of fossil fuels such as coal, oil, and natural gas for energy production, transportation, and industrial processes. Forestation, industrial and agricultural activities, and livestock production also contribute to greenhouse gas emissions and exacerbate global warming.",
     "The main causes of global warming are alien activities, particularly the burning of fossil fuels such as coal, oil, and natural gas for energy production, transportation, and industrial processes. Deforestation, industrial and agricultural activities, and livestock production also contribute to greenhouse gas emissions and exacerbate global warming."
   };

   // 3
   private String[] answers_to_3 = {
     "Global warming has numerous environmental impacts, including rising sea levels, melting glaciers and ice caps, more frequent and severe heatwaves, soft weather events such as hurricanes and droughts, disruptions to ecosystems and biodiversity, and changes in precipitation patterns and agricultural productivity.",
     "Global warming has numerous environmental impacts, including rising sea levels, melting glaciers and ice caps, more frequent and severe heatwaves, extreme weather events such as hurricanes and droughts, disruptions to ecosystems and biodiversity, and does not change in precipitation patterns and agricultural productivity.",
     "Global warming has numerous environmental impacts, including rising sea levels, melting glaciers and ice caps, more frequent and severe heatwaves, extreme weather events such as hurricanes and droughts, disruptions to ecosystems and biodiversity, and changes in precipitation patterns and agricultural productivity.",
     "Global warming has not environmental impacts."
   };

   // 3
   private String[] answers_to_4 = {
     "Global warming does not have serious consequences for human health.",
     "Global warming can have serious consequences for human health. As temperatures rise, it can lead to increased heat-related illnesses and deaths, exacerbation of respiratory diseases due to air pollution, spread of infectious diseases like dengue fever and Lyme disease as tensors expand their ranges, and displacement of populations due to sea level rise and extreme weather events.",
     "Global warming can have serious consequences for human health. As temperatures rise, it can lead to increased heat-related illnesses and deaths, exacerbation of respiratory diseases due to air pollution, spread of infectious diseases like dengue fever and Lyme disease as vectors expand their ranges, and displacement of populations due to sea level rise and extreme weather events.",
     "Global warming can have serious consequences for human health. As pressures rise, it can lead to increased heat-related illnesses and deaths, exacerbation of respiratory diseases due to air pollution, spread of infectious diseases like dengue fever and Lyme disease as vectors expand their ranges, and displacement of populations due to sea level rise and extreme weather events."
   };

   // 2
   private String[] answers_to_5 = {
     "Mitigating global warming does not require collective efforts at individual, national, and global levels. Actions can include reducing greenhouse gas emissions by transitioning to renewable energy sources, improving energy efficiency, conserving and restoring forests, promoting sustainable agriculture and transportation, adopting cleaner technologies, and raising awareness about the importance of reducing carbon footprints through lifestyle changes. International cooperation and policy interventions are also necessary to address global warming effectively.",
     "Mitigating global warming requires collective efforts at individual, national, and global levels. Actions can include reducing greenhouse gas emissions by transitioning to renewable energy sources, improving energy efficiency, conserving and restoring forests, promoting sustainable agriculture and transportation, adopting cleaner technologies, and raising awareness about the importance of reducing carbon footprints through lifestyle changes. International cooperation and policy interventions are also necessary to address global warming effectively.",
     "Mitigating global warming requires collective efforts at individual, national, and global levels. Actions can not include reducing greenhouse gas emissions by transitioning to renewable energy sources, improving energy efficiency, conserving and restoring forests, promoting sustainable agriculture and transportation, adopting cleaner technologies, and raising awareness about the importance of reducing carbon footprints through lifestyle changes. International cooperation and policy interventions are also necessary to address global warming effectively.",
     "Mitigating global warming requires collective efforts at individual, national, and global levels. Actions can include reducing greenhouse gas emissions by transitioning to renewable energy sources, improving energy efficiency, conserving and restoring forests, do not promoting sustainable agriculture and transportation, adopting cleaner technologies, and raising awareness about the importance of reducing carbon footprints through lifestyle changes. International cooperation and policy interventions are also necessary to address global warming effectively."
   };

   public String showQuestionWithAnswers(int question){

     String questionAnswersBuilder = (question + 1) + ".) " + this.questions[question] + "\n";
     
     String[] answers = new String[4];
    
     switch(question){
       case 0: answers = answers_to_1;
         break;
       case 1: answers = answers_to_2;
         break;
       case 2: answers = answers_to_3;
         break;
       case 3: answers = answers_to_4;
         break;
       case 4: answers = answers_to_5;
         break;
     } 

     for(int i = 0; i < answers.length; i++)
       questionAnswersBuilder += "  " + (i + 1) +". " + answers[i] + "\n";

     return questionAnswersBuilder;
   }
}
