# CompilerHorizon

Wie benutzt man den Compiler:
1. Kommandozeile öffnen
2. Zum Verzeichnis navigieren, in dem die CompilerHorizon.jar Datei ablegt ist
3. Dort mit dem Befehl "java -jar CompilerHorizon-1.0-SNAPSHOT-jar-with-dependencies.jar Dateipfad_von_Compiledatei" für die gewünschte Datei den Compileprozess starten
4. Anschließend sollten im selben Verzeichnis die entsprechend kompilierten .class Dateien liegen





Was nicht geht:
- For-Schleifen
- public / private Constructor
- Strings
- Klassen-Variablen ohne AccessModifier (Variablen in Klasse müssen AccessModifier haben)
- Klassen mit AccessModifier (Klassen dürfen keinen AccesModifier haben)
- Alle Identifier müssen min. 2 Zeichen lang sein
- Methoden brauchen einen Access Modifier
- Um auf Variablen in einer Klasse zuzugreifen, muss this. davor stehen

-> wurde in Doku übernommen
