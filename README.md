Resolución del ejercicio N°18 de la unidad 4 d eprogramación 2.
El programa simula un sistema de adquisición y monitoreo de datos para sensores industriales aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de clases abstractas, herencia y polimorfismo para gestionar de manera unificada diferentes tipos de sensores físicos (temperatura, presión y flujo), permitiendo que un panel de control central solicite y recopile lecturas y estados operativos de forma masiva y transparente, sin importar la tecnología interna de cada sensor.

Clases y Componentes Utilizados
SensorIndustrial (Clase Abstracta)

Propósito: Actúa como la plantilla base para cualquier tipo de sensor en la planta industrial. Define atributos comunes como idSensor y estadoOperativo, y declara el método abstracto String leerMetrica(), obligando a las clases hijas a implementar su propia lógica de conversión de señales eléctricas a valores numéricos legibles.

SensorTemperatura (Clase Concreta / Hija)

Propósito: Modela un sensor térmico. Sobrescribe el método abstracto para transformar la señal eléctrica cruda (por ejemplo, proveniente de una termorresistencia o termocupla) en grados Celsius o Fahrenheit.

SensorPresion (Clase Concreta / Hija)

Propósito: Modela un transductor o sensor de presión. Implementa su propia conversión para traducir variaciones de voltaje o corriente en unidades de presión (como PSI o Bar).

SensorFlujo (Clase Concreta / Hija)

Propósito: Modela un caudalímetro o sensor de flujo. Aplica la lógica matemática necesaria para convertir pulsos o señales analógicas en una tasa de caudal volumétrico (por ejemplo, litros por minuto).

PanelControl (Clase Coordinadora)

Propósito: Funciona como la consola central o PLC de supervisión. Mantiene una colección heterogénea de dispositivos tipados como SensorIndustrial y permite ejecutar un barrido de métricas de forma masiva y polimórfica (solicitarLecturas()).
<img width="558" height="547" alt="Captura de pantalla 2026-10-29 153900" src="https://github.com/user-attachments/assets/675ecd75-0d0a-4b8d-9736-90589b14c204" />
