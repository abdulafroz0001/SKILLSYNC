const jobs = [
  {
    title: "Software Engineering",
    image: "/images/admin_imgs/software-engineer.jpg",
    details:
      "Responsible for designing, developing and maintaining software systems and applications.",
    openPositions: "2",
    link: "adminCoursePage",
  },
  {
    title: "Database Management System" ,
    image: "/images/admin_imgs/data-scientist.jpg",
    details:
      "Responsible for collecting, analyzing and interpreting large data sets to help organizations make better decisions.",
    openPositions: "3",
    link: "adminCoursePage",
  },
  {
    title: "Java Full Stack and Microservice",
    image: "/images/admin_imgs/java.png",
    details:
      "Responsible for planning, executing and closing projects on time and within budget.",
    openPositions: "1",
    link: "adminCoursePage",
  },
  {
    title: "React Js",
    image: "/images/admin_imgs/product-manager.jpg",
    details:
      "Responsible for managing the entire product life cycle, from ideation to launch and post-launch maintenance.",
    openPositions: "1",
    link: "adminCoursePage",
  },
  {
    title: "Data Analysis",
    image: "/images/admin_imgs/sales-representative.jpg",
    details:
      "Responsible for reaching out to potential customers and closing sales deals.",
    openPositions: "4",
    link: "adminCoursePage",
  },
  {
    title: "Data Visualization",
    image: "/images/admin_imgs/marketing-manager.jpg",
    details:
      "Responsible for creating and executing marketing strategies to promote a company or product.",
    openPositions: "1",
    link: "adminCoursePage",
  },
];


const jobsHeading = document.querySelector(".jobs-list-container h2");
const jobsContainer = document.querySelector(".jobs-list-container .jobs");
const jobSearch = document.querySelector(".jobs-list-container .job-search");
let searchTerm = "";
if (jobs.length == 1)
{
  jobsHeading.innerHTML = `${jobs.length} Courses`;
}
else
{
  jobsHeading.innerHTML = ` Courses`;
}
const createJobListingCards = () => 
{
  jobsContainer.innerHTML = "";
  jobs.forEach((job) => 
  {
    if (job.title.toLowerCase().includes(searchTerm.toLowerCase())) 
    {
      let jobCard = document.createElement("div");
      jobCard.classList.add("job");
      let image = document.createElement("img");
      image.src = job.image;
      let title = document.createElement("h3");
      title.innerHTML = job.title;
      title.classList.add("job-title");
      let details = document.createElement("div");
      details.innerHTML = job.details;
      details.classList.add("details");
      let detailsBtn = document.createElement("a");
      detailsBtn.href = job.link;
      detailsBtn.innerHTML = "Edit";
      detailsBtn.classList.add("details-btn");
      let openPositions = document.createElement("span");
      openPositions.classList.add("open-positions");
      job.openPositions = "21CS6969"
      if (job.openPositions == 1) 
      {
        openPositions.innerHTML = `${job.openPositions} open position`;
      }
      else
      {
        openPositions.innerHTML = `${job.openPositions} `;
      }
      jobCard.appendChild(image);
      jobCard.appendChild(title);
      jobCard.appendChild(details);
      jobCard.appendChild(detailsBtn);
      jobCard.appendChild(openPositions);
      jobsContainer.appendChild(jobCard);
    }
  });
};
createJobListingCards();
jobSearch.addEventListener("input", (e) => 
{
  searchTerm = e.target.value;
  createJobListingCards();
});