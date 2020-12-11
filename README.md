# GLS-BE
## Exigence
* E1 : visiter un territoire composé de lieux connectés par des chemins
* E2 : Le **joueur** unique est l’explorateur
* E3 : L’explorateur possède un nombre illimité de **connaissances** et un nombre limité **d’objets**
* E4 : Un explorateur peut posséder **plusieurs exemplaires** d’un même objet
* E5 : Chaque objet est qualifié par sa **taille**
* E6 : Le nombre d’objets que peut posséder un explorateur est limité par la taille cumulée des objets possédés
* E7 : Les lieux explorés peuvent contenir des **connaissances**, des **objets** et des **personnes**
* E8 : Le point de départ et les points de fin de l’exploration sont des lieux particuliers
* E9 : Les connaissances, les objets et les personnes contenus dans un lieu peuvent être visibles/actifs ou invisibles/inactifs selon des conditions
* E10 : Les chemins peuvent être ouverts ou fermés selon des conditions
* E11 : Lorsqu’il se trouve dans un lieu, l’explorateur reçoit les connaissances visibles de ce lieu
* E12 : Lorsqu’il se trouve dans un lieu, l’explorateur peut prendre les objets visibles de son choix
* E13 : Lorsqu’il se trouve dans un lieu, si cela est autorisé par des conditions, l’explorateur peut déposer les objets de son choix
* E14 : Les objets déposés sur un lieu resteront sur place et pourront être repris ultérieurement par l’explorateur
* E15 : Lorsqu’il se trouve dans un lieu, l’explorateur peut emprunter un chemin visible et ouvert de son choix
* E16 : Le passage par un chemin peut transmettre à l’explorateur des connaissances et des objets
* E17 : Le passage par un chemin peut consommer des objets possédés par l’explorateur
* E18 : Les connaissances transmises et les objets transmis et consommés lors du passage par un chemin peuvent dépendre de conditions
* E19 : Les conditions sont des combinaisons logiques des connaissances et objets possédés parl’explorateur. Les conditions peuvent dépendre du nombre d’exemplaires d’un objet (relation de comparaison avec des constantes). Pour des raisons de simplicité, les conditions seront écrites en forme normale disjonctive
* E20 : L’explorateur peut interagir avec les personnes présentes dans un lieu
* E21 : Les interactions permettent à l’explorateur de recevoir des connaissances et des objets
* E22 : Les interactions prennent la forme de choix
* E23 : Le choix de début de l’interaction peut dépendre de conditions
* E24 : Un choix consiste à proposer à l’explorateur plusieurs actions
* E25 : L’explorateur doit choisir une action ou quitter l’interaction s’il s’agit d’un choix de fin
* E26 : Le fait qu’un choix soit un choix de fin peut dépendre de conditions
* E27 : Les actions proposées dépendent de conditions et des choix précédents de l’explorateur
* E28 : Une action peut attribuer à l’explorateur des connaissances et des objets
* E29 : Les connaissances et objets attribués dépendent de conditions
* E30 : Une action peut consommer des objets de l’explorateur
* E31 : Les lieux, chemins, connaissances et objets sont qualifiés par une description textuelle qui peut dépendre de conditions

## Taches
* T1 : Définir avec Xtext une syntaxe concrète textuelle pour les modèles de jeu. Le métamodèle sera celui engendré par Xtext. Une attention particulière sera portée à la facilité d’utilisation de la syntaxe concrète proposée
