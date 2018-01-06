![Logo image](img/sbtscalasamlogo_small.png)

# sam-authorization-seed.g8
A template project for quickly creating a serverless authentication and authorization service leveraging [AWS Cognito](https://aws.amazon.com/cognito/) 
[Amazon Cognito User Pools](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html). 
Amazon Cognito User Pools provide a secure user directory that scales to hundreds of millions of users. As a fully managed service, 
User Pools are easy to set up without any worries about server infrastructure. User Pools provide user profiles and authentication 
tokens for users who sign up directly and for federated users who sign in with social and enterprise identity providers.

For more information see [sbt-sam](https://github.com/dnvriend/sbt-sam)

## Usage
Create a new template project by typing:

```
sbt new dnvriend/sam-authorization-seed.g8
```

## Deploy
To deploy the project type `samDeploy`

## Remove
To remove the project type `samRemove`

## Info
To get info about the component, type `samInfo`
