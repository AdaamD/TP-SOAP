# Projet de Recherche et Réservation de Chambres d'Hôtel

Ce projet Java propose un système de recherche et de réservation de chambres d'hôtel, avec une fonctionnalité permettant de passer par une agence pour effectuer des recherches dans des hôtels partenaires et faire des réservations avec des réductions.

## Prérequis

- **Java 8 :** Assurez-vous d'avoir Java 8 installé sur votre système.
- **Compiler 1.8 :** Utilisez un compilateur compatible avec Java 8.
- **IntelliJ :** Compilez et exécutez le projet en utilisant IntelliJ IDEA. Cliquez sur la flèche verte ("Run") dans l'IDE pour lancer le projet.

## Structure du Projet

Le projet est divisé en deux répertoires principaux :

### 1. Utilisation Client
- `UtilisationClient` : Contient les fichiers générés par `wsimport` pour la consommation des services web.

- `PackageUtilisation` : Inclut les classes `MyClient` et `MyAgence` qui permettent l'utilisation des services web côté client.

### 2. ReservationHotel
- `Model` : Contient les classes définissant la structure des hôtels, des chambres, des clients, des réservations, etc.

- `Service` : Comprend les interfaces définissant les services web pour la recherche et la réservation de chambres.

- `ServiceImpl` : Contient les implémentations des services web, avec des classes telles que `RechercheChambreHotelImpl` et `ReservationChambreAvecAgenceImpl`.

**Remarque :** L'utilisation de `UtilisationClient` offre une séparation claire entre les classes générées par `wsimport` et le reste du code source. La structure du répertoire `ReservationHotel` permet une organisation logique des composants du projet.


## Configuration du Projet

1. **Téléchargement de wsimport :** Pour utiliser wsimport, téléchargez le JDK 8 correspondants [ici](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html).

2. **Exécution de wsimport :** Après chaque modification des fichiers d'implémentation des services web, exécutez la commande suivante pour mettre à jour les classes générées :
    ```bash
    wsimport -keep -p "NomDuPackageGénéré" "Url_Du_Wsdsl_A_Consommer"
    ```
   Assurez-vous de remplacer l'URL par celle correspondant à votre service web.

## Comment exécuter le projet

- Désarchivez le projet TP2.
- Ouvrez le projet dans l'IDE de votre choix.
- Construisez le projet à l'aide de l'option 'BUILD Project'.
- Exécutez  Main.
- Exécutez myClient ou myAgence.
## Utilisation

### 1. Compilation et Publication du Service Web

- Compilez et exécutez la classe principale (`Main`) pour publier le service web.
- **Remarque :** À chaque modification dans les fichiers d'implémentation des services web, relancez la commande `wsimport` avec l'URL appropriée pour mettre à jour les classes générées.

### 2. Consommation des Services Web

#### a. Côté Hôtel (myclient)

- Exécutez la classe `MyClient` pour être du côté de l'hôtel.
- Effectuez une recherche de chambre en utilisant la méthode correspondante. La liste des offres de chambres sera retournée.
- Effectuez une réservation de chambre en choisissant une offre. Une confirmation de réservation avec un résumé sera fournie.

#### b. Côté Agence (myagence)

- Exécutez la classe `MyAgence` pour être du côté de l'agence.
- Authentifiez-vous en tant qu'agence en fournissant le nom et le mot de passe.
- Choisissez le numéro d'offre à réserver parmi la liste d'offres disponibles.
- Une confirmation de réservation avec un résumé sera fournie.

## Remarques

- Ce projet utilise des technologies de services web (JAX-WS) pour communiquer entre les différentes parties du système.
- Assurez-vous d'avoir les bonnes URLs et configurations lors de l'utilisation de `wsimport` après des modifications dans les services web.

## Auteur

Ce projet a été réalisé par :

- DAIA Adam
- DAFAOUI Mohamed

Étudiants en M1 Génie Logiciel à l'Université de Montpellier
