# TP Hibernate

## 📂 Fichiers et Dossiers

### 1. `com.example.persistence` (Gestion de la persistence)

- **`HibernateUtil.java`**  
  Contient la configuration Hibernate et la gestion des sessions. Il utilise `SessionFactory` pour établir la connexion avec la base de données.

- **`Entreprise.java`**  
  Représente l'entité `Entreprise` dans Hibernate. Cette classe est mappée à la table `Entreprises` de la base de données. Elle contient des attributs comme `idEntreprise`, `nomEnt`, `listeActivites`, et `nbEmployes`.

- **`EntrepriseDAO.java`**  
  Fournit des méthodes CRUD pour l'entité `Entreprise`. Parmi les méthodes disponibles, on trouve `ajouterEntreprise()`, `getEntrepriseById()`, `updateEntrepriseName()`, et `deleteEntreprise()`.

### 2.`com.example.tests` (Exercices & Tests)

- **`Exercice1.java`**  
  Permet d'insérer une nouvelle entreprise dans la base de données.

- **`Exercice2.java`**  
  Recherche une entreprise à partir de son `idEntreprise`.

- **`Exercice3.java`**  
  Exécute une requête HQL (Hibernate Query Language) pour récupérer les entreprises selon des critères filtrés.

- **`Exercice4.java`**  
  Permet de mettre à jour le nom d'une entreprise et de supprimer une ou plusieurs entreprises.

### 3. Dossier `resources` (Fichiers de configuration)

- **`hibernate.cfg.xml`**  
  Contient la configuration de Hibernate, y compris les informations de connexion à la base de données MySQL (`URL`, `username`, `password`), ainsi que la stratégie de mise à jour du schéma.

### 4. Fichier `pom.xml` (Dépendances Maven)

- **`pom.xml`**  
  Gère les dépendances du projet avec Maven. Il inclut les bibliothèques nécessaires pour Hibernate (`hibernate-core`) et MySQL (`mysql-connector-java`).

## 🚀 Lancer le projet

### Prérequis

- Java 8 ou supérieur
- MySQL ou une base de données compatible
- Maven pour gérer les dépendances

### Étapes pour lancer le projet :

1. **Cloner le projet :**

    ```bash
    git clone https://github.com/ton-utilisateur/HibernateProject.git
    cd HibernateProject
    ```

2. **Configurer la base de données :**  
   Créer une base de données MySQL et configurer les informations de connexion dans le fichier `hibernate.cfg.xml`.

3. **Construire le projet avec Maven :**

    ```bash
    mvn clean install
    ```

4. **Exécuter les exercices :**  
   Ouvrir le fichier `Exercice1.java` pour insérer une entreprise, ou tout autre fichier dans le dossier `com.example.tests` pour tester les différentes fonctionnalités.
